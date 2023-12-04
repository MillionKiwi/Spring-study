package com.hyunho.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {
    List<String> todos = Arrays.asList("A", "B", "C");
    @Test
    void test(){
        boolean test = todos.contains("A");
        //assertEquals(true,test);
        assertTrue(test);
        assertEquals(3, todos.size());
    }
}