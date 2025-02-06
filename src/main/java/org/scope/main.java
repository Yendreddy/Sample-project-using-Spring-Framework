package org.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HeadMaster headMaster = context.getBean(HeadMaster.class);
        headMaster.hierarchy();
        headMaster.setJob("To maintain school");
        System.out.println(headMaster);

        HeadMaster headMaster1 = context.getBean(HeadMaster.class);
        System.out.println(headMaster1);
    }
}
