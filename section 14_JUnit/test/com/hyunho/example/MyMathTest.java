package com.hyunho.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MyMathTest {
    @Test
    void test(){

        int[] numbers ={1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println(result);

        //예측값 비교
        int expectedResult = 5;
        assertEquals(expectedResult,result);
    }
}