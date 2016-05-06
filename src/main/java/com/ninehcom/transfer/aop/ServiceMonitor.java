/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ninehcom.transfer.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Component
public class ServiceMonitor {

    private static final Logger LOG = Logger.getLogger(ServiceMonitor.class.getName());

    @Around("execution(* com.ninehcom.*.controller.*Controller.*(..))")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint) throws JSONException, NoSuchMethodException {
        final String methodName = thisJoinPoint.getSignature().getName();
        final MethodSignature methodSignature = (MethodSignature) thisJoinPoint.getSignature();
        Object target = thisJoinPoint.getTarget();
        Method method = methodSignature.getMethod();
        if (method.getDeclaringClass().isInterface()) {
            method = target.getClass().getDeclaredMethod(methodName, method.getParameterTypes());
        }
        RequestMapping annotation = method.getAnnotation(RequestMapping.class);

        JSONArray array = new JSONArray();
        Object[] args = thisJoinPoint.getArgs();

        if (args != null) {
            for (Object arg : args) {
                if ((arg.getClass().getModifiers() & Modifier.FINAL) == Modifier.FINAL) {
                    array.put(arg);
                } else {
                    array.put(new JSONObject(arg));
                }
            }
        }

        try {
            String uuid = UUID.randomUUID().toString();
            LOG.log(Level.INFO, "[{0}],{1},params=:{2}", new Object[]{uuid, annotation.value()[0], array.toString()});
            Object ret = (Object) thisJoinPoint.proceed();
            String retValue = new JSONObject(ret).toString();
            LOG.log(Level.INFO, "[{0}],{1},return=:{2}", new Object[]{uuid, annotation.value()[0], retValue});
            return ret;
        } catch (Throwable e) {
            LOG.throwing(target.getClass().getName(), methodName, e);
        }
        return null;
    }

}
