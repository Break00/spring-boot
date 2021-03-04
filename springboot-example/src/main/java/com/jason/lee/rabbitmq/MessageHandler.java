package com.jason.lee.rabbitmq;

import cn.hutool.core.util.StrUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author huanli9
 * @description
 * @date 2021/3/4 15:50
 */
@Component
public class MessageHandler {

    @RabbitListener(queues = "xmu.news")
    public void receive(Message message){
        System.out.println(message.getMessageProperties());
        System.out.println(StrUtil.str(message.getBody(),"utf-8"));
    }
}
