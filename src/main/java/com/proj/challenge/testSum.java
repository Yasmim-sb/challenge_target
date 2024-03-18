package com.proj.challenge;

public class testSum {

    public static int sum(int index, int sum, int k){
        while (k < index){
            k = k + 1;
            sum = sum + k;
        }
        System.out.println("the result is = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        sum(13, 0, 0);
    }
}
