package com.javatpoint.setter_injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
    private int id;
    private String name;
    private Map<String, String> answers;

    public QuestionMap() { }

    public QuestionMap(int id, String name, Map<String, String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name );
        Set<Entry<String, String>> set = answers.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        while(itr.hasNext()) {
            Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + " by " + entry.getValue());
        }
    }
}
