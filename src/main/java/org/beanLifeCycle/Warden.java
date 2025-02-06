package org.beanLifeCycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Warden implements Hostel, BeanNameAware {
    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    @Override
    public String toString() {
        return "Warden{" +
                "cook='" + cook + '\'' +
                '}';
    }

    private String cook;

    public void manage(){
        System.out.println("I will manage this hostel");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name method is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct method is called");
    }
}
