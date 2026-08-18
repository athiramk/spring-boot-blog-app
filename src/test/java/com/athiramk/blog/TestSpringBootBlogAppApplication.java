package com.athiramk.blog;

import org.springframework.boot.SpringApplication;

public class TestSpringBootBlogAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootBlogAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
