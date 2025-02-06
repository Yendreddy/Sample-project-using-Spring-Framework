package org.useAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[]args){
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Family family = context.getBean(Mother.class);
        family.relation();
    }
}
