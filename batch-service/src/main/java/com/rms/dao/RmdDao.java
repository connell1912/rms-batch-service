package com.rms.dao;

import com.rms.model.ResourceMetadata;

import org.springframework.data.repository.CrudRepository;

public interface RmdDao extends CrudRepository<ResourceMetadata, Integer>{
    
    ResourceMetadata findById(int id);
}