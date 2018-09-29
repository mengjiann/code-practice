package com.mj.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s){
        if(s == null || s.isEmpty() || s.length() == 1){
            return true;
        }

        int p = 0;
        int q = s.length()-1;
        s = s.toLowerCase();
        while(p < q){
            char pChar = s.charAt(p);
            if(!(pChar>= 'A' && pChar <= 'Z') &&
                    !(pChar>= 'a' && pChar <= 'z') &&
                    !(pChar>= '0' && pChar <= '9') ){
                p++;
                continue;
            }
            char qChar = s.charAt(q);
            if(!(qChar>= 'A' && qChar <= 'Z') &&
                    !(qChar>= 'a' && qChar <= 'z') &&
                    !(qChar>= '0' && qChar <= '9') ){
                q--;
                continue;
            }
            if(pChar != qChar){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}
