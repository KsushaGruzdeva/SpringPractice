package com.springpractice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice.dtos.CreateServicesDto;
import com.springpractice.dtos.ServicesDto;
import com.springpractice.services.ServiceService;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService servicesService;

    @GetMapping("/{id}")
    public ServicesDto findById(@PathVariable() int id){
        Optional<ServicesDto> servicesOpt = servicesService.findById(id);
        return servicesOpt.get();
    }

    @PostMapping("")
    public ServicesDto create(@RequestBody CreateServicesDto createServicesDto){
        return servicesService.create(createServicesDto);
    }

    @GetMapping("/byName")
    public List <ServicesDto> findByName(@RequestParam(name = "name") String name){
        List <ServicesDto> servicesOpt = servicesService.findByName(name);
        return servicesOpt;
    }

    @GetMapping("")
    public List <ServicesDto> findAll(){
        List <ServicesDto> servicesOpt = servicesService.findAll();
        return servicesOpt;
    }
}