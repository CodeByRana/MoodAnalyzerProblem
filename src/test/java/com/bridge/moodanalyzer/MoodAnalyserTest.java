package com.bridge.moodanalyzer;

import com.bridge.exception.MoodAnalyzerException;
import com.bridge.service.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenItContainsSadItShouldReturnSadMood() throws MoodAnalyzerException {
        MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "sad";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenItContainsInAnyMoodItShouldReturnHappyMood() throws MoodAnalyzerException {
        MoodAnalyser mood = new MoodAnalyser("I am in any mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "happy";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenItContainsInHappyMoodItShouldReturnHappyMood() throws MoodAnalyzerException {
        MoodAnalyser mood = new MoodAnalyser("I am in happy mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "happy";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyser mood = new MoodAnalyser(null);
        String actualMood;
        try {
            actualMood = mood.analyseMood();
        }
        catch (MoodAnalyzerException e){
            String expectedMood="null";
            Assert.assertEquals(expectedMood,e.message);
        }

    }

    @Test
    public void givenMessageWhenEmptyItShouldReturnHappy()  {
        MoodAnalyser mood = new MoodAnalyser("");
        String actualMood;
        try {
            actualMood = mood.analyseMood();
        } catch (MoodAnalyzerException e) {
            String expectedMood = "EmptyMood";
            System.out.println(e.message);
            Assert.assertEquals(expectedMood,e.message);
        }

    }
}
