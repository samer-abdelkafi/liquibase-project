package com.mycompany.todo.liqui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@Slf4j
@SpringBootApplication
public class TodoLiquibase  {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TodoLiquibase.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run();
        log.info("**** Done successfully :))))");
        exit(0);
    }


}
