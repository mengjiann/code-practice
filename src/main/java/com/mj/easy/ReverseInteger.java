package com.mj.easy;

public class ReverseInteger {

    public Integer solution(Integer input){
        boolean negativeFlag = false;
        if(input < 0){
            negativeFlag = true;
            input = -input;
        }
        int temp = input;
        int tempOverflow = 0;
        int reverse = 0;

        while(temp > 0){
            reverse = reverse * 10 + temp % 10;

            if((reverse - temp % 10) / 10 != tempOverflow){
                return 0;
            }
            tempOverflow = reverse;
            temp = temp / 10;
        }


        return (negativeFlag) ? -reverse : reverse;
    }

}
