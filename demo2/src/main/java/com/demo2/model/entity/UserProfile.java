package com.demo2.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @JoinColumn(
            name = "users_id",
            nullable = false,
            unique = true,
            referencedColumnName = "id"
    )
    @OneToOne
    private User user ;

}
