package com.fluffyengine.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FluffyData {
    @Id
    private String id;
    private int count;

    public FluffyData(String id) {
        this.id = id;
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }
}
