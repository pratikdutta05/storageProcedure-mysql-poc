package com.poc.hashedinvg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Data
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@NamedStoredProcedureQuery(name = "getAllAddress",
        procedureName = "get_all_address")
public class Address {

    @Id

    private BigInteger id;


    private String city;


    private String street;
}
