package com.javatpoint.setter_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("setterInjectionApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        System.out.println("*****************************");
        Employee e = (Employee) factory.getBean("obj");
        e.display();
        System.out.println("*****************************");

        System.out.println("*****************************");
        QuestionList qList = (QuestionList) factory.getBean("qlist");
        qList.displayInfo();
        System.out.println("*****************************");

        System.out.println("*****************************");
        QuestionMap qMap = (QuestionMap) factory.getBean("qmap1");
        qMap.displayInfo();
        System.out.println("*****************************");

        System.out.println("*****************************");
        QuestionMap1 qMap1 = (QuestionMap1) factory.getBean("qmap2");
        qMap1.displayInfo();
        System.out.println("*****************************");
    }
}
