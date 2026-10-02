package com.ryan.micro.demo;

import com.ryan.micro.demo.entity.Author;
import com.ryan.micro.demo.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                Author author = new Author();
                author.setName("Ricky.Lee");
                Author origin = authorRepository.save(author);
                System.out.println(">>>>> " + origin);
                System.exit(0);
            }
        };
    }
}
