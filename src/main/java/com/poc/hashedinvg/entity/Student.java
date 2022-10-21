package com.poc.hashedinvg.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    private Integer id;

    private Integer address_id;

    private  String email;

    private  String first_name;

    private  String last_name;


}
