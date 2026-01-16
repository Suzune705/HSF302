package com.suzune.demo3.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Table(name = "Users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id ;
    @Column(name = "username", length = 100)
    private String username ;
    @Column(name = "email", length = 100)
    private String email ;
    @OneToOne(mappedBy = "user")
    private Profile profile ;
}
