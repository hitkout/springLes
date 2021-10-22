package ru.osminkin.springprojects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class SecondBean {
    private FirstBean firstBean;

    SecondBean(FirstBean firstBean){
        this.firstBean = firstBean;
    }

    public void method(){
        firstBean.sayHello();
    }
}
