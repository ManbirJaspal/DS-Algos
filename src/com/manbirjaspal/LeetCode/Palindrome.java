package com.manbirjaspal.LeetCode;

public class Palindrome {
    //Palindrome Number

    public static void main(String[] args) {

        boolean pal = palindrome(1221);
        System.out.println(pal);

    }

    public static boolean palindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reversedNum = 0;
        while(num > reversedNum ) {
            reversedNum = (reversedNum * 10) + (num % 10);
            num /= 10;
        }

        return num == reversedNum || num == reversedNum/10;

    }
}
