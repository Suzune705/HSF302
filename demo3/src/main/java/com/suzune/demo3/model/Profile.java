package com.suzune.demo3.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "Profiles")
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id ;
    @Column(name = "full_name", length = 150, nullable = true)
    private String fullname ;
    @Column(name = "birthday", nullable = true)
    private LocalDate birthDate;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user ;
}
