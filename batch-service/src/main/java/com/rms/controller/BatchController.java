package com.rms.controller;

import com.rms.model.Batch;
import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/batch")
public class BatchController{

    BatchService bs;

    @Autowired
    public void setBs(BatchService bs){
        this.bs = bs;
    }

    @GetMapping(value = "/allbatches")
    public Iterable<Batch> readAllBatches() {
        return bs.readAll();
    }

    @PostMapping(value = "/newbatch")
    public Batch addNewbatch(Batch b) {
        return bs.insert(b);
    }

    @PutMapping(value = "/updatebatch")
    public Batch updateBatch(Batch b) {
        return bs.update(b);
    }

    @DeleteMapping(value = "/deletebatch")
    public void deleteBatch(Batch b) {
        bs.delete(b);
    }

}