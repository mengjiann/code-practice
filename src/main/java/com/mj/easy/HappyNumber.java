package com.mj.easy;

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n){

        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n = getSum(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    private int getSum(int n){
        int res = 0;
        while (n != 0){
            res += (n%10) * (n%10);
            n = n/10;
        }
        return res;
    }

}
