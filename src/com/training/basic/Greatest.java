package com.training.basic;

import java.util.Arrays;

public class Greatest {
    public static void main(String[] args){
        //Create a method and call
        int[] numbers = {1, 2, 3, 4, 5};
        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println("Greatest No : "+ max);
    }

}
