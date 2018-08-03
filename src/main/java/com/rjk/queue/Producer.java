package com.rjk.queue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("queueProducer.xml");

        ProducerService bean = context.getBean(ProducerService.class);

        for (int i =0;i<100;i++){
            bean.sendMessage("hehe"+i);
        }

        context.close();
    }
}
