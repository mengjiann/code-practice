package com.mj.easy;

public class BinaryGap {

    /**
     Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.

     If there aren't two consecutive 1's, return 0.
     */

    public int binaryGap(int N){
        if(N < 2){
            return 0;
        }

        int max = 0;
        int start = 0;

        String binaryStr = Integer.toBinaryString(N);
        for (int i = 1; i < binaryStr.length(); i++) {

            if(binaryStr.charAt(i) == '1'){
                int tempMax = i - start;
                if(tempMax > max){
                    max = tempMax;
                }
                start = i;
            }
        }

        return max;
    }
}
