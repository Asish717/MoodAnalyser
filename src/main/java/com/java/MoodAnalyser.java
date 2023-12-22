package com.java;

public class MoodAnalyser {
    public String mood(String message){
        if (message==null||message.isEmpty()){
            return "Its empty!!";
        }
        else if (message.contains("happy")||message.contains("Happy")){
            return "Happy";
        }
        else {
            return "Sad Mood";
        }
    }
}
