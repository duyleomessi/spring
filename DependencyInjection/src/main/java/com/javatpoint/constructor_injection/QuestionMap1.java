package com.javatpoint.constructor_injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap1 {
    private int id;
    private String name;
    private Map<AnswerMap, User> answers;

    public QuestionMap1(int id, String name, Map<AnswerMap, User> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public QuestionMap1() {}

    public void displayInfo() {
        System.out.println("Question id: " + id);
        System.out.println("Question name: " + name);
        System.out.println("Answers...");

        Set<Entry<AnswerMap, User>> set = answers.entrySet();
        Iterator<Entry<AnswerMap, User>> itr = set.iterator();

        while(itr.hasNext()) {
            Entry<AnswerMap, User> entry = itr.next();
            AnswerMap answer = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer: " + answer + " by: " + user);
        }
    }
}
