/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.common.util;

import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.transfer.entity.Team;
import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.interfaces.IMapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Shenjizhe
 */
public class ListComparator<T1, T2> {

    public class Result {

        private Map<T1, T2> same;
        private List diff1;
        private List diff2;

        public Result() {
        }

        public Result(Map<T1, T2> same, List<T1> diff1, List<T2> diff2) {
            this.same = same;
            this.diff1 = diff1;
            this.diff2 = diff2;
        }

        public Translog getLog(List<T1> sourceList, List<T2> destList, String source, String destination) {
            Translog log = new Translog();
            log.setOperator(source + ">>" + destination);
            log.setSource(source);
            log.setDestination(destination);
            log.setSourceCount(sourceList.size());
            log.setDestinationCount(destList.size());
            Map<T1, T2> same = getSame();
            log.setSameCount(same.size());
            log.setSourceDiff(getDiff1().size());
            log.setDestinationDiff(getDiff2().size());
            log.setTime(new Date());
            return log;
        }

        /**
         * @return the diff1
         */
        public List<T1> getDiff1() {
            return diff1;
        }

        /**
         * @param diff1 the diff1 to set
         */
        public void setDiff1(List<T1> diff1) {
            this.diff1 = diff1;
        }

        /**
         * @return the diff2
         */
        public List<T2> getDiff2() {
            return diff2;
        }

        /**
         * @param diff2 the diff2 to set
         */
        public void setDiff2(List<T2> diff2) {
            this.diff2 = diff2;
        }

        /**
         * @return the same
         */
        public Map<T1, T2> getSame() {
            return same;
        }

        /**
         * @param same the same to set
         */
        public void setSame(Map<T1, T2> same) {
            this.same = same;
        }
    }

    Class<T1> cls1;
    Class<T2> cls2;
    String key1;
    String key2;
    List<Method> method1;
    List<Method> method2;

    private String[] getKeys(String key) {
        if (key == null) {
            return null;
        } else {
            return key.split(",");
        }
    }

    private List<Method> getMethods(Class cls, String[] keys) throws NoSuchMethodException {
        List<Method> methodList = new ArrayList();
        if (keys != null) {
            for (int i = 0; i < keys.length; i++) {
                Method method = cls.getMethod(keys[i], null);
                methodList.add(method);
            }
        }
        return methodList;
    }

    public ListComparator(Class<T1> cls1, Class<T2> cls2, String key1, String key2) throws NoSuchMethodException {
        this.cls1 = cls1;
        this.cls2 = cls2;
        this.key1 = key1;
        this.key2 = key2;

        this.method1 = getMethods(cls1, getKeys(key1));
        this.method2 = getMethods(cls2, getKeys(key2));
    }

    private List<String> GetValue1(Object obj) throws IllegalArgumentException, InvocationTargetException, IllegalAccessException {
        List<String> vlist = new ArrayList();

        for (int i = 0; i < method1.size(); i++) {
            Object vo = method1.get(i).invoke(obj, null);
            if (vo != null) {
                vlist.add(vo.toString());
            } else {
                vlist.add(null);
            }
        }

        return vlist;
    }

    private List<String> GetValue2(Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        List<String> vlist = new ArrayList();

        for (int i = 0; i < method2.size(); i++) {
            Object vo = method2.get(i).invoke(obj, null);
            if (vo != null) {
                vlist.add(vo.toString());
            } else {
                vlist.add(null);
            }

        }

        return vlist;
    }

    private boolean equal(List<String> v1, List<String> v2) {
        for (int i = 0; i < v1.size(); i++) {
            if (v1 == null || v2 == null) {
                if (v1 != v2) {
                    return false;
                }
            } else if (!v1.get(i).equals(v2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Result compare(List<T1> list1, List<T2> list2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Map<T1, T2> same = new HashMap();
        List<T1> diffList1 = new ArrayList();
        List<T2> diffList2 = new ArrayList();

        diffList1.addAll(list1);
        diffList2.addAll(list2);
        
        if( key1 == null && key2 == null ){
            return new Result(same, diffList1, diffList2);
        }

        for (T1 obj1 : list1) {
            List<String> v1 = GetValue1(obj1);
            for (T2 obj2 : list2) {
                List<String> v2 = GetValue2(obj2);
                if (equal(v1, v2)) {
                    same.put(obj1, obj2);
                    diffList1.remove(obj1);
                    diffList2.remove(obj2);
                }
            }
        }
        return new Result(same, diffList1, diffList2);
    }
}
