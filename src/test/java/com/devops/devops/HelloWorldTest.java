package com.devops.devops;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


public class HelloWorldTest {
    @InjectMocks
    HelloWorld helloWorld;

    @Test
    public void testHelloWorld(){
        helloWorld.helloWorld();
    }
}
