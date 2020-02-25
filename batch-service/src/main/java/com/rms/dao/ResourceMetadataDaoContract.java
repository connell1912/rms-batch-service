package com.rms.dao;

import com.rms.model.ResourceMetadata;

import org.springframework.data.repository.CrudRepository;

public interface ResourceMetadataDaoContract extends CrudRepository<ResourceMetadata, Integer>{
    
}