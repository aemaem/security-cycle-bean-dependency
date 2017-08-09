package com.example.securitycyclebeandependency;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class SecurityCycleBeanDependencyApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SecurityCycleBeanDependencyApplication.class)
                .initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> applicationContext.setAllowCircularReferences(false))
                .run(args);
    }
}
