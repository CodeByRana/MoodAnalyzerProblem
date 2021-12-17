package com.bridge.service;

import com.bridge.exception.MoodAnalyzerException;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if(this.message.length()==0){
                throw new MoodAnalyzerException("EmptyMood", MoodAnalyzerException.ExceptionType.EMPTY);
            }
            if (this.message.toLowerCase().contains("sad"))
                return "sad";
            return "happy";
        }
        catch (NullPointerException e){
            throw new MoodAnalyzerException("null", MoodAnalyzerException.ExceptionType.NULL);

        }

    }
}
