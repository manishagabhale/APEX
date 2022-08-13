package com.example.apex;

public class TestModel {
    String title;
    String no_of_question;
    String duration;
    String max_attempt;

    public TestModel(String title, String no_of_question, String duration, String max_attempt) {
        this.title = title;
        this.no_of_question = no_of_question;
        this.duration = duration;
        this.max_attempt = max_attempt;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNo_of_question() {
        return no_of_question;
    }

    public void setNo_of_question(String no_of_question) {
        this.no_of_question = no_of_question;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMax_attempt() {
        return max_attempt;
    }

    public void setMax_attempt(String max_attempt) {
        this.max_attempt = max_attempt;
    }


}
