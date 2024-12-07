package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstructorController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Instructor instructor = (Instructor) context.getBean("instructor");
        System.out.println("Instructor Details: " + instructor);
    }
}