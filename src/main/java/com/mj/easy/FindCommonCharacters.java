package com.mj.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {

        List<int[]> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        for(String s: A){
            int[] frequency = new int[26];

            for( char c: s.toCharArray()){
                frequency[c-'a']++;
            }
            list.add(frequency);
        }

        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for(int[] array:list){
                min = Math.min(array[i],min);
            }
            for (int j = 0; j < min; j++) {
                res.add(String.valueOf((char)(i+'a')));
            }
        }
        return res;
    }

}
