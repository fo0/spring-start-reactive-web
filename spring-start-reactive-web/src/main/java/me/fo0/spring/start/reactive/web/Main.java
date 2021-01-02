package me.fo0.spring.start.reactive.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @created 02.01.2021 - 01:33:24
 * @author fo0 (GH:fo0)
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
                                                // .properties(null)
                                                .run(args);
    }

}