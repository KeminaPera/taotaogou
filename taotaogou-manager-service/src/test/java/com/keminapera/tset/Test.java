package com.keminapera.tset;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        Object bean = cpxac.getBean("testProjectServiceImpl");
        System.out.println(bean);
    }
}
