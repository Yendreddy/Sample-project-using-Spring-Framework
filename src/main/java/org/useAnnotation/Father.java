package org.useAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Father implements Family{
    public void relation(){
        System.out.println("I am Father");
    }
}
