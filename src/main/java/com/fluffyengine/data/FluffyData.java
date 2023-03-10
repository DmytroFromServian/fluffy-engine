package com.fluffyengine.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FluffyData {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String data;
    private int level;

}
