package com.rms.controller;

import com.rms.service.ResourceMetadataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceMetadataController {

    ResourceMetadataService rms;

    @Autowired
    public void setRms(ResourceMetadataService rms){
        this.rms = rms;
    }

}