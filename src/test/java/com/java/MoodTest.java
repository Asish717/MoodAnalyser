package com.java;

import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    MoodAnalyser analyser=new MoodAnalyser();
    @Test
    public void test2(){
        String message="I m in Sad Mood";
        String check=analyser.mood(message);
        System.out.println(check);
        Assert.assertEquals("SAD",check);
    }
}
