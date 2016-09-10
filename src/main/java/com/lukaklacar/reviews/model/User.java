package com.lukaklacar.reviews.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Luka on 9/3/2016.
 */
@Entity
@Data
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "enabled")
    private int enabled;

}
