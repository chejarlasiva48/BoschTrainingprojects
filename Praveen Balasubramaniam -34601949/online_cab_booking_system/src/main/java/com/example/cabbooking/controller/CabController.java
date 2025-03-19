package com.example.cabbooking.controller;

import com.example.cabbooking.model.Cab;
import com.example.cabbooking.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cabs")
public class CabController {
    @Autowired
    private CabRepository cabRepository;

    @GetMapping
    public List<Cab> getAllCabs() {
        return cabRepository.findAll();
    }

    @PostMapping
    public Cab addCab(@RequestBody Cab cab) {
        return cabRepository.save(cab);
    }
}