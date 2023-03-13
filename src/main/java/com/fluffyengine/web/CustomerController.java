package com.fluffyengine.web;

import com.fluffyengine.data.FluffyCustomer;
import com.fluffyengine.dto.CustomerDTO;
import com.fluffyengine.repository.FluffyCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer/")
public class CustomerController {

    @Autowired
    private FluffyCustomerRepository repository;

    @GetMapping("/{username}")
    public FluffyCustomer getCustomer(@PathVariable String username) {
        return repository.findByUsername(username).orElse(null);
    }

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customer) {
        System.out.println(customer);
        repository.save(FluffyCustomer.fromDTO(customer));
    }
}
