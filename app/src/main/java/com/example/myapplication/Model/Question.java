package com.example.myapplication.Model;

public class Question {
    private String content;
    private boolean anwser;
    //get and set

    public Question() {

    }

    public Question(String content, boolean anwser) {
        this.content = content;
        this.anwser = anwser;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isAnwser() {
        return anwser;
    }

    public void setAnwser(boolean anwser) {
        this.anwser = anwser;
    }
}
