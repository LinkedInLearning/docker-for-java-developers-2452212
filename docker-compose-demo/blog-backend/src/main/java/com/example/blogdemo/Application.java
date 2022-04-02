package com.example.blogdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Spring Data JPA Web Application for message blogging
 */
@SpringBootApplication
@RestController
public class Application {
    private static ConfigurableApplicationContext context;

    @Autowired
    private BlogRepository repository;

    /**
     * Get all Blog entities in the database.
     *
     * @return List of Blog Entities.
     */
    @GetMapping("/blogs")
    public List<Blog> getAll(){
        return repository.findAll();
    }

    /**
     * Create a Blog Message
     *
     * @param message string message
     * @return Created Blog Entity
     */
    @PostMapping("/blogs")
    public Blog create(@RequestBody String message) {

        return repository.save(new Blog().setMessage(message));
    }

    /**
     * Stop then entire application.
     * Not a normal method, here for demontration
     */
    @GetMapping("/stop")
    public void stop(){
        System.out.println("SHUTTING DOWN");
        context.close();
        return ;
    }
    public static void main(String[] args) {
        context = SpringApplication.run(Application.class, args);
    }


}
