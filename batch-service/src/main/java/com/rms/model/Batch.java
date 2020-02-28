package com.rms.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table
public class Batch {
     
    // @SequenceGenerator(name="BatchID_seq", sequenceName = "BatchID_seq", initialValue = 1, allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BatchID_seq")
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

    // @OneToOne(fetch = FetchType.EAGER)
    // private ResourceMetadata resourceMetadata;

    public Batch() {
        super();
    }

    public Batch(int batchId, String batchName, LocalDate startDate, LocalDate endDate, int trainerId, int coTrainerId, int associates, Curriculum curriculum) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainerId = trainerId;
        this.coTrainerId = coTrainerId;
        this.associates = associates;
        this.curriculum = curriculum;
        // this.resourceMetadata = resourceMetadata;
    }

    public Batch(String batchName, LocalDate startDate, LocalDate endDate, int trainerId, int coTrainerId, int associates, Curriculum curriculum) {
        this.batchName = batchName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainerId = trainerId;
        this.coTrainerId = coTrainerId;
        this.associates = associates;
        this.curriculum = curriculum;
        // this.resourceMetadata = resourceMetadata;
    }

    public int getBatchId() {
        return this.batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return this.batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getTrainerId() {
        return this.trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public int getCoTrainerId() {
        return this.coTrainerId;
    }

    public void setCoTrainerId(int coTrainerId) {
        this.coTrainerId = coTrainerId;
    }

    public int getAssociates() {
        return this.associates;
    }

    public void setAssociates(int associates) {
        this.associates = associates;
    }

    public Curriculum getCurriculum() {
        return this.curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    // public ResourceMetadata getResourceMetadata() {
    //     return this.resourceMetadata;
    // }

    // public void setResourceMetadata(ResourceMetadata resourceMetadata) {
    //     this.resourceMetadata = resourceMetadata;
    // }

    public Batch batchId(int batchId) {
        this.batchId = batchId;
        return this;
    }

    public Batch batchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public Batch startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public Batch endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public Batch trainerId(int trainerId) {
        this.trainerId = trainerId;
        return this;
    }

    public Batch coTrainerId(int coTrainerId) {
        this.coTrainerId = coTrainerId;
        return this;
    }

    public Batch associates(int associates) {
        this.associates = associates;
        return this;
    }

    public Batch curriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
        return this;
    }

    // public Batch resourceMetadata(ResourceMetadata resourceMetadata) {
    //     this.resourceMetadata = resourceMetadata;
    //     return this;
    // }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Batch)) {
            return false;
        }
        Batch batch = (Batch) o;
        return batchId == batch.batchId && Objects.equals(batchName, batch.batchName) && Objects.equals(startDate, batch.startDate) && Objects.equals(endDate, batch.endDate) && trainerId == batch.trainerId && coTrainerId == batch.coTrainerId && Objects.equals(associates, batch.associates) && Objects.equals(curriculum, batch.curriculum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId, batchName, startDate, endDate, trainerId, coTrainerId, associates, curriculum);
    }

    @Override
    public String toString() {
        return "{" +
            " batchId='" + getBatchId() + "'" +
            ", batchName='" + getBatchName() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", trainerId='" + getTrainerId() + "'" +
            ", coTrainerId='" + getCoTrainerId() + "'" +
            ", associates='" + getAssociates() + "'" +
            ", curriculum='" + getCurriculum() + "'" +
            // ", resourceMetadata='" + getResourceMetadata() + "'" +
            "}";
    }
    
}