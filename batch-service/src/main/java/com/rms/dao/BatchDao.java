package com.rms.dao;

import java.time.LocalDate;

import com.rms.model.Batch;
import com.rms.model.Curriculum;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BatchDao extends CrudRepository<Batch, Integer> {

    Batch findById(int id);

    Batch findByStartDateBefore(LocalDate startDate);

    Batch findByCurriculumEquals(Curriculum c);

    Batch findByTrainerIdEquals(int id);
    
}