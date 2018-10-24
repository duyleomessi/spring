package com.javatpoint.constructor_injection;

import java.util.Date;

public class AnswerMap {
    private int id;
    private String answer;
    private Date postedDate;

    public AnswerMap() {}

    public AnswerMap(int id, String answer, Date postedDate) {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }

    public String toString() {
        return "Id: " + id + " answer: " + answer + " postedDate: " + postedDate;
    }

}
