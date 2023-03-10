package com.fluffyengine.web;

import com.fluffyengine.data.FluffyData;
import com.fluffyengine.repository.FluffyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fluffy/")
public class FluffyController {
    @Autowired
    private FluffyRepository fluffyRepository;

    @GetMapping("/{id}")
    public FluffyData getFluffyData(@PathVariable String id) {
        FluffyData data = fluffyRepository.findById(id).orElse(new FluffyData(id));
        data.increment();
        fluffyRepository.save(data);
        return data;
    }


}
