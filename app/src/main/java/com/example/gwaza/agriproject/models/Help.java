package com.example.gwaza.agriproject.models;

/**
 * Created by gwaza on 1/21/2019.
 */

public class Help {
    private String issue1;
    private String issue2;
    private String issue3;

    public Help(String issue1, String issue2, String issue3) {
        this.issue1 = issue1;
        this.issue2 = issue2;
        this.issue3 = issue3;
    }

    public String getIssue1() {
        return issue1;
    }

    public void setIssue1(String issue1) {
        this.issue1 = issue1;
    }

    public String getIssue2() {
        return issue2;
    }

    public void setIssue2(String issue2) {
        this.issue2 = issue2;
    }

    public String getIssue3() {
        return issue3;
    }

    public void setIssue3(String issue3) {
        this.issue3 = issue3;
    }
}
