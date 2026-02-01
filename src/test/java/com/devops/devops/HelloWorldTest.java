package com.devops.devops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HelloWorldTest {
    @InjectMocks
    HelloWorld helloWorld;

    @Test
    public void testHelloWorld(){
        helloWorld.helloWorld();
    }
}
