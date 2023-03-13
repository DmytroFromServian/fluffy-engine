package com.fluffyengine.data;

import com.fluffyengine.dto.CustomerDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class FluffyCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    public static FluffyCustomer fromDTO(CustomerDTO customerDTO) {
        FluffyCustomer customer = new FluffyCustomer();
        customer.setUsername(customerDTO.getUsername());
        customer.setLevel(0);
        return customer;
    }

    private String username;
    private int level;

}
