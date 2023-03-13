package com.fluffyengine.web;

import com.fluffyengine.data.FluffyData;
import com.fluffyengine.dto.FluffyDataDTO;
import com.fluffyengine.repository.FluffyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fluffy/")
public class FluffyController {
    @Autowired
    private FluffyRepository fluffyRepository;

    @GetMapping("/{id}")
    public FluffyData getFluffyData(@PathVariable String id) {
        return fluffyRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void save(@RequestBody FluffyDataDTO dto) {
        FluffyData data = new FluffyData();
        data.setData(dto.getData());
        data.setLevel(dto.getLevel());
        fluffyRepository.save(data);
    }


}
