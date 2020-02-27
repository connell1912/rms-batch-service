package com.rms.controller;

import com.rms.model.Batch;
import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class BatchController{

    @Autowired
    BatchService bs;

    public void setBs(BatchService bs){
        this.bs = bs;
    }

    @GetMapping("/allbatches")
    public Iterable<Batch> readAllBatches() {
        return bs.readAll();
    }

    @GetMapping("/batch{id}")
    public Batch findBatchById(@PathVariable("id") int id) {
        return bs.findBatchById(id);
    }

    @PostMapping("/newbatch")
    public Batch addNewbatch(Batch b) {
        return bs.insert(b);
    }

    @PutMapping("/updatebatch")
    public Batch updateBatch(Batch b) {
        return bs.update(b);
    }

    // have this update by ID method in case we need it
    @PutMapping("/updatebatch{id}")
    public Batch updateById(@PathVariable("id") int id) {
        return bs.updateById(id);
    }

    @DeleteMapping("/deletebatch")
    public void deleteBatch(Batch b) {
        bs.delete(b);
    }

}