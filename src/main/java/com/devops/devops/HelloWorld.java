package com.devops.devops;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {
    public void helloWorld(){
        try {
            System.out.println("Initializing Hello World Service");
            Thread.sleep(10000);
            System.out.println("Assalam Alaikum Lyari");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
