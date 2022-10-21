package com.poc.hashedinvg.repository;

import com.poc.hashedinvg.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.math.BigInteger;
import java.util.List;

public interface AddressRepository extends JpaRepository<Address, BigInteger> {

    @Procedure(name = "getAllAddress")
    List<Object> getAllAddress();
}
