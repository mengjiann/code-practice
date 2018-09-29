package com.mj.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        s = s.trim();

        int n = s.length() - 1;
        int len = 0;
        while(n >= 0 && s.charAt(n) != ' ' ){
            len++;
            n--;
        }
        return len;
    }
}
