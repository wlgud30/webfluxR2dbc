package com.example.demo.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Post")
@AllArgsConstructor
public class Post {

    @Id
    @org.springframework.data.annotation.Id
    public Long id;

    public String title;

    public String content;

    public LocalDateTime createdAt;
}
