package com.rms.controller;

import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController{

    BatchService bs;

    @Autowired
    public void setBs(BatchService bs){
        this.bs = bs;
    }

}