package ru.osminkin.springprojects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class FirstBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name);
    }
}