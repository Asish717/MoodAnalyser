package com.java;

import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    MoodAnalyser analyser=new MoodAnalyser(" ");
    @Test
    public void test2(){
        String check=analyser.mood();
        System.out.println(check);
        Assert.assertEquals("HAPPY",check);
    }
}
