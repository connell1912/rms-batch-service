package com.rms.model;

import java.time.LocalDate;

import javax.persistence.Column;
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


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batchId; 
    
    @Column
    private String batchName;
    
    @Column
    private LocalDate startDate;
    
    @Column
    private LocalDate endDate;
    
    @Column
    private int trainerId;
    
    @Column
    private int coTrainerId;
    
    @Column
    private int associates;
    
    @Column
    @Enumerated(EnumType.STRING)
    private Curriculum curriculum;

    @OneToOne
    private ResourceMetadata resourceMetadata;
    
}