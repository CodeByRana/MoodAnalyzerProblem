package com.bridge.exception;

public class MoodAnalyzerException extends Exception{

    public ExceptionType exceptionType;
    public String message;
    public enum ExceptionType {
        EMPTY,NULL
    }
    public  MoodAnalyzerException(String message, ExceptionType exceptionType){
        this.message=message;
        this.exceptionType=exceptionType;
    }
    public MoodAnalyzerException(String message) {
        this.message=message;
    }
}
