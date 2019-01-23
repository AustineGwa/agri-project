package com.example.gwaza.agriproject.models;

/**
 * Created by gwaza on 1/19/2019.
 */

public class Question {
    private String subject;
    private String messageBody;
    private String userName;

    public Question() {
    }

    public Question(String subject, String messageBody) {
        this.subject = subject;
        this.messageBody = messageBody;
    }

    public Question(String subject, String messageBody, String userName) {
        this.subject = subject;
        this.messageBody = messageBody;
        this.userName = userName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
