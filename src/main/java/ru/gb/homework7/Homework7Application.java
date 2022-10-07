package ru.gb.homework7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class Homework7Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework7Application.class, args);
    }

}
