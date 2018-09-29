package com.mj.easy;

public class RomanToInteger {

    public int romanToInt(String s) {

        char[] stringArray = s.toCharArray();

        int temp = 0;
        for (int i = 0; i < stringArray.length-1; i++) {
            int val = this.value(stringArray[i]);
            int val1 = this.value(stringArray[i+1]);
            if(val >= val1){
                temp = temp + val;
            }else {
                temp-=val;
            }
        }
        return temp+value(stringArray[stringArray.length-1]);
        
    }

    private int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 9999;
        }
    }
    
}
