package com.rms.service;

import com.rms.dao.RmdDao;
import com.rms.model.ResourceMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RmdService {

    @Autowired
    RmdDao rd;

    public void insert(ResourceMetadata rm){
        rd.save(rm);
    }

    public void update(ResourceMetadata rm){
        rd.save(rm);
    }

    // update by ID in case we need it
    public void updateById(int id){
        ResourceMetadata rm = rd.findById(id);
        rd.save(rm);
    }
     
}