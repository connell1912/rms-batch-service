package com.rms.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 1912dec16 Java Fullstack Batch
 * <br>
 * <br>
 * The Batch class defines our Batch model. It utilizes JPA to be able to be persisted into our H2 databases
 * and Lombok to have getters, setters, no/all args constructors through its annotations.
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batchId; 
    
    private String batchName;
    
    private LocalDate startDate;
    
    private LocalDate endDate;
    
    private int trainerId;
    
    private int coTrainerId;
    
    private int associates;
    
    @Enumerated(EnumType.STRING)
    private Curriculum curriculum;

    @OneToOne
    private ResourceMetadata resourceMetadata;

    public Batch(String batchName, LocalDate startDate, LocalDate endDate, int trainerId, int coTrainerId, int associates, Curriculum curriculum) {
        this.batchName = batchName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainerId = trainerId;
        this.coTrainerId = coTrainerId;
        this.associates = associates;
        this.curriculum = curriculum;
    }
      
}