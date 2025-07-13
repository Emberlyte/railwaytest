package org.example.railwaytest.asd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "test")
public class Model {
    @Id
    private Long id;

    private String name;
}
