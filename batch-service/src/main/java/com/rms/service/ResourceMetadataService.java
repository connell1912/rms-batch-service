package com.rms.service;

import java.util.Optional;

import com.rms.dao.ResourceMetadataDaoContract;
import com.rms.model.ResourceMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceMetadataService {

    ResourceMetadataDaoContract rmdc;

    @Autowired
    public void setRmdc(ResourceMetadataDaoContract rmdc) {
        this.rmdc = rmdc;
    }

    public Iterable<ResourceMetadata> findAll() {
        return rmdc.findAll();
    }

    public ResourceMetadata insert(ResourceMetadata rm) {
        return rmdc.save(rm);
    }

    public ResourceMetadata update(ResourceMetadata rm) {
        return rmdc.save(rm);
    }

    public void delete(ResourceMetadata rm) {
        rmdc.delete(rm);
    }

    public Optional<ResourceMetadata> findById(int id) {
        return rmdc.findById(id);
    }

}