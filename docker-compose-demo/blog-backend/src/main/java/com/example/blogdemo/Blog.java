package com.example.blogdemo;

import javax.persistence.*;

@Entity
@Table(name = "BLOG")
public class Blog {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String message;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Blog setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Blog blog = (Blog) o;

        return message.equals(blog.message);
    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }
}
