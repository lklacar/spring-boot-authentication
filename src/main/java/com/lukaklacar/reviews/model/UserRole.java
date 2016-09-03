package com.lukaklacar.reviews.model;

/**
 * Created by Luka on 9/3/2016.
 */


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id")
    private Long userroleid;

    @Column(name = "userid")
    private Long userid;

    @Column(name = "role")
    private String role;

}
