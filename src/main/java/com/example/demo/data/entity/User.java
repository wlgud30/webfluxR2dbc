package com.example.demo.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "User",indexes = @Index(name="idx_user_email",columnList = "email"))
public class User {

    @Id
    @javax.persistence.Id
    private Long id;

    private String email;

    private String password;

    private String name;

    private LocalDateTime createdAt;

}
