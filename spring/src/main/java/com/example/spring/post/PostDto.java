package com.example.spring.post;

import java.util.Date;

import lombok.Data;

@Data
public class PostDto {
    private int id;
    private String title;
    private String content;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;

}
