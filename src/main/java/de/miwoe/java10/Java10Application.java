package de.miwoe.java10;

import de.miwoe.java10.a.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Java10Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Java10Application.class, args);
        run.getBean(MyService.class).doSomething();
        System.out.println("DONE!");
    }
}
