package com.example.demo2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name="USER_INFO")
public class UserInfo {


    private Long id;
    private String addr;
    private String tel;
    private String email;
    private String password;
    private String role;
    private String isDel;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;
    private Long userId;
}
