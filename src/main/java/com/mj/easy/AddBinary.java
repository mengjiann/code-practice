package com.mj.easy;

public class AddBinary {

    public String addBinaryApi(String first, String second){
        int num1 = Integer.parseInt(first,2);
        int num2 = Integer.parseInt(second,2);
        return Integer.toBinaryString(num1+num2);
    }


    public String addBinaryNonApi(String a, String b){

        int firstLen = a.length();
        int secondLen = b.length();
        int carry = 0;
        String res = "";

        int maxLen = Math.max(firstLen,secondLen);

        for (int i = 0; i < maxLen  ; i++) {

            int p = i < firstLen ? a.charAt(firstLen - 1 - i) - '0' : 0;

            int q = i < secondLen ? b.charAt(secondLen - 1 - i) - '0' : 0;

            int temp = p + q + carry;
            carry = temp / 2;

            res =  temp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }

}
