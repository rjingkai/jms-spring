package com.rjk.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

public class ProducerServiceImpl implements ProducerService {

    //定义JMStemplate
    @Autowired
    JmsTemplate jmsTemplate;

    //定义目标
    @Resource(name = "queueDestination")
    Destination destination;


    public void sendMessage(final String message){

        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                // 创建一个消息
                TextMessage textMessage = session.createTextMessage(message);

                return textMessage;
            }
        });
        System.out.println("发送消息"+message);
    }
}
