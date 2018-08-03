package com.rjk.topic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topicProducer.xml");
        ProducerService bean = context.getBean(ProducerService.class);

        for (int i = 0;i<100;i++){
              bean.sendMessage("topic:"+i);
        }
        context.close();
    }
}
