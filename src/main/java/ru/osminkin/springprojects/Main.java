package ru.osminkin.springprojects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        HelloWorldBean service = (HelloWorldBean) context
                .getBean("helloWorldBean");
        service.setName("Hello, world!");
        System.out.println(service.sayHello());
    }
}
