package com.javatpoint.setter_injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap1 {
    private int id;
    private String name;
    private Map<Answer, User> answers;

    public QuestionMap1() {
    }

    public QuestionMap1(int id, String name, Map<Answer, User> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Answer, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Answer, User> answers) {
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        Set<Entry<Answer, User>> set = answers.entrySet();
        Iterator<Entry<Answer, User>> itr = set.iterator();

        while(itr.hasNext()) {
           Entry<Answer, User> entry = itr.next();
           System.out.println(entry.getKey().displayInfo() + " " + entry.getValue().displayInfo());
        }
    }
}
