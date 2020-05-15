package com.udea.butchershop.butchershop.controller;

import com.udea.butchershop.butchershop.dto.CustomerDto;
import com.udea.butchershop.butchershop.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/customers")
@Validated
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerDto> create(@RequestBody @Valid CustomerDto customerDTO) {
    	CustomerDto customerCreate = customerService.create(customerDTO);
        return new ResponseEntity<CustomerDto>(customerCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CustomerDto> update(@RequestBody @Valid CustomerDto customerDTO) {
        return ResponseEntity.ok(customerService.update(customerDTO));
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
    	customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
