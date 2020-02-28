package com.rms.service;

import java.time.LocalDate;

import com.rms.dao.BatchDao;
import com.rms.model.Batch;
import com.rms.model.Curriculum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

    @Autowired
    BatchDao bd;

    public void setBd(BatchDao bd) {
        this.bd = bd;
    }

    public Iterable<Batch> readAll() {
        return bd.findAll();
    }

    public Batch findBatchById(int id) {
        return bd.findById(id).get();
    }

    public Batch insert(Batch b) {
        return bd.save(b);
    }

    public Batch update(Batch b) {
        return bd.save(b);
    }

    public Batch updateById(int id) {
        Batch b = bd.findById(id).get();
        return bd.save(b);
    }

    public void delete(Batch b){
        bd.delete(b);
    }

    public void deleteById(int id) {
        Batch b = bd.findById(id).get();
        bd.delete(b);
    }

    public Batch findByDate(LocalDate startDate){
        return bd.findByStartDateBefore(startDate);
    }

    public Batch findByCurriculum(Curriculum c) {
        return bd.findByCurriculumEquals(c);
    }

    public Batch findByTrainer(int id) {
        return bd.findByTrainerIdEquals(id);
    }

}