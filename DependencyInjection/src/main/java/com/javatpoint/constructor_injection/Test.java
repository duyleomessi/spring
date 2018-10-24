package com.javatpoint.constructor_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("constructorInjectionApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        System.out.println("*******************");
        System.out.println("Employee");
        Employee s = (Employee) factory.getBean("e");
        s.show();
        System.out.println("*******************");
        System.out.println();

        System.out.println("*******************");
        System.out.println("Question using list");
        Question q = (Question) factory.getBean("question");
        q.displayInfo();
        System.out.println("*******************");
        System.out.println();

        System.out.println("*******************");
        System.out.println("Question using map");
        QuestionMap qm = (QuestionMap) factory.getBean("questionMap");
        qm.displayInfo();
        System.out.println("*******************");

        System.out.println("*******************");
        System.out.println("Question using map 1");
        QuestionMap1 qm1 = (QuestionMap1) factory.getBean("questionMap1");
        qm1.displayInfo();
        System.out.println("*******************");
    }
}
