package org.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MAIN {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureFile.class);
        Warden warden = context.getBean(Warden.class);
        warden.manage(); 
        warden.setCook("I will cook food");
    }
}
