package ru.osminkin.springprojects;

import org.springframework.stereotype.Service;

@Service("helloWorldBean")
public class HelloWorldBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return name;
    }
}
