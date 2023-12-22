package com.java;

public class MoodAnalyser {
    public String mood(String message){
        if (message==null||message.isEmpty()){
            return "Its empty!!";
        }
        else if (message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
//Given “I am in Any
//        Mood” message
//        Should Return HAPPY
//
//        To make the Test case pass
//        analyseMood method need to check
//        for Sad else return HAPPY
