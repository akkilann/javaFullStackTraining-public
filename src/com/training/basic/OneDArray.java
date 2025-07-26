package com.training.basic;

public class OneDArray {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 200};
        int total=0;
        for(int num : nums){
            total+=num;
        }
        System.out.println(total);
    }
}
