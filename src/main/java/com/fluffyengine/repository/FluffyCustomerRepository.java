package com.fluffyengine.repository;

import com.fluffyengine.data.FluffyCustomer;
import com.fluffyengine.data.FluffyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FluffyCustomerRepository extends CrudRepository<FluffyCustomer, String> {
    Optional<FluffyCustomer> findByUsername(String username);
}
