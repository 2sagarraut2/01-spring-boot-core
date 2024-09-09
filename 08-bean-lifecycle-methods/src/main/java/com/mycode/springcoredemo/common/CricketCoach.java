package com.mycode.springcoredemo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void startupMethod() {
        System.out.println("In startupMethod(): " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void destroyMethod() {
        System.out.println("In destroyMethod(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice running for 30 minutes";
    }
}
