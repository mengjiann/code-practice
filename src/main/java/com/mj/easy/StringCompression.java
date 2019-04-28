package com.mj.easy;

import java.util.Arrays;

public class StringCompression {

    public int compress(char[] chars){
        if(chars.length <= 0){
            return 0;
        }
        if(chars.length == 1){
            return 1;
        }

        int currentChar = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            char atChar = chars[i];
            if(atChar == chars[currentChar]){
                count ++;
            }else{
                if(count > 1){
                    char[] countChar  = Integer.toString(count).toCharArray();
                    for (int j = 0; j < countChar.length; j++) {
                        chars[currentChar+1+j] = countChar[j];
                    }
                    currentChar = currentChar + Integer.toString(count).toCharArray().length;
                }
                count = 1;
                currentChar++;
                chars[currentChar] = atChar;
            }
        }

        System.out.println(Arrays.toString(chars));

        if(count > 1){
            char[] countChar  = Integer.toString(count).toCharArray();
            for (int j = 0; j < countChar.length; j++) {
                chars[currentChar+1+j] = countChar[j];
            }
            currentChar = currentChar + Integer.toString(count).toCharArray().length;
        }
        currentChar++;

        System.out.println(Arrays.toString(chars));

        return currentChar;
    }

}
