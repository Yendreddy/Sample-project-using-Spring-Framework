package org.aspectOrientedProgramming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigure.class);

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("Cancelled");
        System.out.println(cart.quantity());
    }
}
