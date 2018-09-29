package com.mj.easy;

public class PalindromeNumber {

    public boolean solution(int x){
        String xStr = String.valueOf(x);
        return xStr.equalsIgnoreCase(new StringBuilder(xStr).reverse().toString());
    }

    public boolean solutionWithoutString(int x){
        if(x<0)
            return false;
        int temp = x;
        int reverse = 0;
        while(temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(reverse);
        return reverse == x;
    }

}
