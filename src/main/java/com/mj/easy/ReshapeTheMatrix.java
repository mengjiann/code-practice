package com.mj.easy;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int actualRow = nums.length;
        int actualColumn = nums[0].length;

        if(r * c / actualRow != actualColumn ){
            return nums;
        }

        int[][] newNums = new int[r][c];

        int tempR = 0;
        int tempC = 0;

        for (int i = 0; i < actualRow; i++) {
            for (int j = 0; j < actualColumn; j++) {
                newNums[tempR][tempC] = nums[i][j];
                if(tempC + 1 < c)
                    tempC++;
                else{
                    tempC = 0;
                    tempR++;
                }
            }
        }
        return newNums;
    }

}
