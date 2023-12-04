package com.hyunho.example;

import org.jetbrains.annotations.NotNull;

public class MyMath {
    public int calculateSum(int @NotNull [] numbers){
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        return sum;
    }
}
