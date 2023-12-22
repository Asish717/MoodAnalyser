package com.java;

import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    MoodAnalyser analyser=new MoodAnalyser();
    @Test
    public void test1(){
        String message="i am very happy";
        String check=analyser.mood(message);
        System.out.println(check);
        Assert.assertEquals("Happy",check);
    }
    @Test
    public void test2(){
        String message="i m sad";
        String check=analyser.mood(message);
        System.out.println(check);
        Assert.assertEquals("Sad Mood",check);
    }
    @Test
    public void test3(){
        String message="   ";
        String check=analyser.mood(message);
        System.out.println(check);
        Assert.assertEquals("Sad Mood",check);
    }
    @Test
    public void test4(){
        String message="";
        String check=analyser.mood(message);
        System.out.println(check);
        Assert.assertEquals("Its empty!!",check);
    }
}
