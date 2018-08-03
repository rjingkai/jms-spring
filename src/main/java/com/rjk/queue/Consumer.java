package com.rjk.queue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("queueConsumer.xml");
    }
}
