package com.example.smmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SmmpApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SmmpApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for(String bean: beanDefinitionNames){
//            System.out.println(run.getBean(bean).getClass());
//        }

    }

}
