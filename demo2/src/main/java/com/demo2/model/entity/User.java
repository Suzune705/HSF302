package com.demo2.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.lang.instrument.ClassDefinition;

@Entity
@Table(name = "user", schema = "suzune")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userID;
    @Column(name = "user_name", length = 20)
    private String name;
    @Column(name = "user_account")
    private String account;
    @Column(name = "password")
    private String password;


}
