package org.useConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.useAnnotation.BeanConfig;

public class main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student student = context.getBean(Books.class);
        student.study();
        System.out.println(Books.getWhichClass());
        //System.out.println(Uniform.getSize());
    }
}
