package com.udea.butchershop.butchershop.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.udea.butchershop.butchershop.dto.CustomerDto;
import com.udea.butchershop.butchershop.entity.Customer;
import com.udea.butchershop.butchershop.repository.CustomerRepository;


import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private CustomerRepository customerRepository;

    private ModelMapper modelMapper;


    public CustomerService(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    public CustomerDto create(CustomerDto customerToCreateDto) {
        LOGGER.debug("Begin create: customerToCreateDto={}", customerToCreateDto);

        Customer customerToCreate = modelMapper.map(customerToCreateDto, Customer.class);
        Customer result = customerRepository.save(customerToCreate);
        CustomerDto resultDTO = modelMapper.map(result, CustomerDto.class);

        LOGGER.debug("End create: resultDTO={}", resultDTO);
        return resultDTO;
    }

    public List<CustomerDto> findAll() {
        List<Customer> listCustomer = (List<Customer>) customerRepository.findAll();
        return listCustomer.stream()
                .map(customer -> modelMapper.map(customer, CustomerDto.class))
                .collect(Collectors.toList());
    }

    public CustomerDto findById(Long id) {
        Optional<Customer> findCustomerOptional = customerRepository.findById(id);
        Customer findCustomer = findCustomerOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findCustomer, CustomerDto.class);
    }

    public void delete(Long id) {
    	CustomerDto customerInDb = findById(id);
    	Customer customerToDelete = modelMapper.map(customerInDb, Customer.class);
    	customerRepository.delete(customerToDelete);
    }

    public CustomerDto update(CustomerDto customerDto) {
        findById(customerDto.getId());
        return create(customerDto);
    }


}
