package com.javatpoint.setter_injection;

import java.util.Iterator;
import java.util.List;

public class QuestionList {
    private int id;
    private String name;
    private List<Answer> answers;

    public QuestionList() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name );
        System.out.println("answers are: ");
        Iterator<Answer> itr = answers.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().displayInfo());
        }
    }
}
