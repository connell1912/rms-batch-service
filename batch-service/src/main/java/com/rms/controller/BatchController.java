package com.rms.controller;

import java.time.LocalDate;

import com.rms.model.Batch;
import com.rms.model.Curriculum;
import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/batch")
@CrossOrigin(origins = "http://localhost:3000")
public class BatchController{

    @Autowired
    BatchService bs;

    public void setBs(BatchService bs){
        this.bs = bs;
    }

    @GetMapping("/all")
    public Iterable<Batch> readAllBatches() {
        return bs.readAll();
    }

    @GetMapping("/{id}")
    public Batch findBatchById(@PathVariable("id") int id) {
        return bs.findBatchById(id);
    }

    @PostMapping("/add")
    public Batch addNewBatch(@RequestBody Batch b) {
        return bs.insert(b);
    }

    @PutMapping("/update")
    public Batch updateBatch(@RequestBody Batch b) {
        return bs.update(b);
    }

    // have this update by ID method in case we need it
    @PutMapping("/updatebyid")
    public Batch updateById(@RequestBody int id) {
        return bs.updateById(id);
    }

    @GetMapping("/bydate/{startDate}")
    public Batch findByDate(@PathVariable("startDate") LocalDate startDate){
        return bs.findByDate(startDate);
    }

    @GetMapping("/bycurr/{c}")
    public Batch findByCurriculum(@PathVariable("c") Curriculum c){
        return bs.findByCurriculum(c);
    }

    @GetMapping("/bytrainer/{id}")
    public Batch findByTrainer(@PathVariable("id") int id){
        return bs.findByTrainer(id);
    }

    @DeleteMapping("/delete")
    public void deleteBatch(Batch b) {
        bs.delete(b);
    }

    @DeleteMapping("/deletebyid")
    public void deleteBatchById(int id) {
        bs.deleteById(id);
    }

}