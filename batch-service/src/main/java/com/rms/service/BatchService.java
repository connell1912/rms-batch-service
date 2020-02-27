package com.rms.service;

import java.util.Optional;

import com.rms.dao.BatchDaoContract;
import com.rms.model.Batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

    @Autowired
    BatchDaoContract bdc;

    public void setBdc(BatchDaoContract bdc) {
        this.bdc = bdc;
    }

    public Iterable<Batch> readAll() {
        return bdc.findAll();
    }

    public Batch findBatchById(int id) {
        return bdc.findById(id).get();
    }

    public Batch insert(Batch b) {
        return bdc.save(b);
    }

    public Batch update(Batch b) {
        return bdc.save(b);
    }

    public Batch updateById(int id) {
        Batch b = bdc.findById(id).get();
        return bdc.save(b);
    }

    public void delete(Batch b){
        bdc.delete(b);
    }

    public void deleteById(int id) {
        Batch b = bdc.findById(id).get();
        bdc.delete(b);
    }

    public Optional<Batch> findById(int id) {
        return bdc.findById(id);
    }

}