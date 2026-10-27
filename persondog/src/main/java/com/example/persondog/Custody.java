package com.example.persondog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Custody {

    @Id
    private String id;
    private int Contract;
    private String startDate;
    private String status;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Dog dog;

}
