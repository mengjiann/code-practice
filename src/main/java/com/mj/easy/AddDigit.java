package com.mj.easy;

public class AddDigit {

    /*
        Digital root: https://en.wikipedia.org/wiki/Digital_root
     */

    public int addDigits(int num) {
        return num - (int)Math.round(9 * Math.floor((num - 1)/9));
    }

}
