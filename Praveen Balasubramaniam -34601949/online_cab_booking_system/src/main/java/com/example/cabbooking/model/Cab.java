package com.example.cabbooking.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String driverName;
    private String contactNumber;
    private String status;
}