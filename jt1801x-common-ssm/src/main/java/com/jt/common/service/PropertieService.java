package com.jt.common.service;

import org.springframework.stereotype.Service;

import com.jt.common.spring.exetend.PropertyConfig;

@Service
public class PropertieService {

    @PropertyConfig
    public String pathw;
    
    @PropertyConfig
    public String urlw;
    
    @PropertyConfig
    public String test;

}
