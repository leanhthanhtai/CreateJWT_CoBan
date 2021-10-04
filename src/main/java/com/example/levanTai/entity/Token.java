package com.example.levanTai.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Tokens")
@Setter
@Getter
public class Token extends  BaseEntity{
    private String tokenName;
    private Date expDate;
}
