package com.mycode.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice running for 30 minutes";
    }
}
