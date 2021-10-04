package com.example.levanTai.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users")
@Setter
@Getter
public class User extends BaseEntity{

    private String username;
    private String password;

}
