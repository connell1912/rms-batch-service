package com.rms.dao;

import java.time.LocalDate;

import com.rms.model.Batch;
import com.rms.model.Curriculum;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 1912dec16 Java Fullstack Batch
 * <br>
 * <br>
 * The BatchDao interface communicates with our H2 database. It utilizes Spring Data and extends the 
 * CrudRepository which gives us access to built in CRUD methods and allows to create abstract methods using 
 * naming conventions that the CrudRepository recognizes and is able provide default implementation.
 */
@Repository
@Transactional
public interface BatchDao extends CrudRepository<Batch, Integer> {

    Batch findById(int id);

    Batch findByStartDateBefore(LocalDate startDate);

    Batch findByCurriculumEquals(Curriculum c);

    Batch findByTrainerIdEquals(int id);
    
}