package com.mj.easy;

import java.util.HashMap;

public class Fibonacci {

    public HashMap<Integer,Integer> map = new HashMap<>();

    public Integer[] intArray = new Integer[]{1,1};

    public Integer getValueAtIndexRecursive(int n){
        if(n < 2){
            return 1;
        }
        return getValueAtIndexRecursive(n-1)+getValueAtIndexRecursive(n-2);
    }

    public Integer getValueAtIndexRecursiveMemoization(int n){
        if(n < 2){
            return 1;
        }
        if(map.get(n) != null){
            return map.get(n);
        }
        Integer value = getValueAtIndexRecursive(n-1)+getValueAtIndexRecursive(n-2);
        map.put(n,value);
        return value;
    }

    public Integer getValueAtIndexIterative(int n){
        if(n < 2){
            return 1;
        }

        int result = 1;
        int previousResult = 1;

        for (int i = 2; i <= n; i++) {
            int temp = result;
            result += previousResult;
            previousResult = temp;
        }
        return result;
    }



}
