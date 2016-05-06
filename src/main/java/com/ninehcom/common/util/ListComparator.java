/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Shenjizhe
 */
public class ListComparator<T1, T2> {

    public class Result {

        private Map<T1,T2> same;
        private List diff1;
        private List diff2;

        public Result() {
        }

        public Result(Map<T1,T2> same, List<T1> diff1, List<T2> diff2) {
            this.same = same;
            this.diff1 = diff1;
            this.diff2 = diff2;
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
        public Map<T1,T2> getSame() {
            return same;
        }

        /**
         * @param same the same to set
         */
        public void setSame(Map<T1,T2> same) {
            this.same = same;
        }
    }

    Class<T1> cls1;
    Class<T2> cls2;
    String key1;
    String key2;
    Method method1;
    Method method2;

    public ListComparator(Class<T1> cls1, Class<T2> cls2, String key1, String key2) throws NoSuchMethodException {
        this.cls1 = cls1;
        this.cls2 = cls2;
        this.key1 = key1;
        this.key2 = key2;
        this.method1 = cls1.getMethod(key1, null);
        this.method2 = cls2.getMethod(key2, null);
    }

    private String GetValue1(Object obj) throws IllegalArgumentException, InvocationTargetException, IllegalAccessException {
        return method1.invoke(obj, null).toString();
    }

    private String GetValue2(Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return method2.invoke(obj, null).toString();
    }

    public Result compare(List<T1> list1, List<T2> list2) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Map<T1,T2> same = new HashMap();
        List<T1> diffList1 = new ArrayList();
        List<T2> diffList2 = new ArrayList();

        diffList1.addAll(list1);
        diffList2.addAll(list2);
        for (T1 obj1 : list1) {
            String v1 = GetValue1(obj1);
            for (T2 obj2 : list2) { 
                String v2 = GetValue2(obj2);
                if (v1.equals(v2)) {
                    same.put(obj1,obj2);
                    diffList1.remove(obj1);
                    diffList2.remove(obj2); 
                }
            }

//            if (!contains) {
//                diffList1.add(obj1);
//            }
        }
        return new Result(same, diffList1, diffList2);
    }
}
