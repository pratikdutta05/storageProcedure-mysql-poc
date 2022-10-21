package com.poc.hashedinvg.controller;

import com.poc.hashedinvg.entity.Address;
import com.poc.hashedinvg.entity.Student;
import com.poc.hashedinvg.repository.AddressRepository;
import com.poc.hashedinvg.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Slf4j
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/allAddress")
    @Transactional
    public List<Object> getAllAddress(){
        log.info("Request for All Address");
        return addressRepository.getAllAddress();
    }
}
