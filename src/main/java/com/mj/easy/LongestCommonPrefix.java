package com.mj.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        char[] fCharArray = first.toCharArray();
        char[] lCharArray = last.toCharArray();

        int limit = Math.min(fCharArray.length,lCharArray.length);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < limit; i++) {
            if(fCharArray[i] == lCharArray[i]){
                sb.append(fCharArray[i]);
            }else{
                break;
            }
        }
        return sb.toString();
    }

}
