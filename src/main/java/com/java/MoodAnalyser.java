package com.java;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String mood(){
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
