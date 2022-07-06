package com.moseswilliamsiii.myrestfulservice.model;

public class GreetingBean {
    private String greeting;

    public GreetingBean(String greeting) {
        this.greeting = greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "GreetingBean{" +
                "greeting='" + greeting + '\'' +
                '}';
    }
}
