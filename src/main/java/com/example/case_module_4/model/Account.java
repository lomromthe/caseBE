package com.example.case_module_4.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAccount;
    private String username;
    private String password;
    private String fullname;
    private String address;
    private String phone;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

}
