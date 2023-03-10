package com.fluffyengine.repository;

import com.fluffyengine.data.FluffyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FluffyRepository extends CrudRepository<FluffyData, String> {
    Optional<FluffyData> findById(String id);
}
