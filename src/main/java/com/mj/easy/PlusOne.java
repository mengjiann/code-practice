package com.mj.easy;

public class PlusOne {

    public int[] plusOne(int[] digits){
        int arrLen = digits.length;
        if(arrLen < 1){
            return new int[]{};
        }

        boolean overflow = true;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] + 1 < 10){
                digits[i] = digits[i]+1;
                overflow = false;
                break;
            }else{
                digits[i] = 0;
            }
        }
        if(overflow){
            int[] newDigits = new int[arrLen+1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }


}
