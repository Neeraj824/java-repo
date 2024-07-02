package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public  void laptop(){
        System.out.println("Laptop Object Creating");
    }
    public void compiler(){
        System.out.println("compiling using Laptop");
    }

}
