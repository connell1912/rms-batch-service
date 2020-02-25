package com.rms.model;

import java.time.LocalDate;
import java.util.Objects;

public class Batch {
     
    private int batchId; 
    private String batchName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int trainerId;
    private int coTrainerId;
    private int[] associates;
    private Curriculum curriculum;
    private ResourceMetadata resourceMetadata;

    public Batch() {
    }

    public Batch(int batchId, String batchName, LocalDate startDate, LocalDate endDate, int trainerId, int coTrainerId, int[] associates, Curriculum curriculum, ResourceMetadata resourceMetadata) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainerId = trainerId;
        this.coTrainerId = coTrainerId;
        this.associates = associates;
        this.curriculum = curriculum;
        this.resourceMetadata = resourceMetadata;
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

    public int[] getAssociates() {
        return this.associates;
    }

    public void setAssociates(int[] associates) {
        this.associates = associates;
    }

    public Curriculum getCurriculum() {
        return this.curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    public void setResourceMetadata(ResourceMetadata resourceMetadata) {
        this.resourceMetadata = resourceMetadata;
    }

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

    public Batch associates(int[] associates) {
        this.associates = associates;
        return this;
    }

    public Batch curriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
        return this;
    }

    public Batch resourceMetadata(ResourceMetadata resourceMetadata) {
        this.resourceMetadata = resourceMetadata;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Batch)) {
            return false;
        }
        Batch batch = (Batch) o;
        return batchId == batch.batchId && Objects.equals(batchName, batch.batchName) && Objects.equals(startDate, batch.startDate) && Objects.equals(endDate, batch.endDate) && trainerId == batch.trainerId && coTrainerId == batch.coTrainerId && Objects.equals(associates, batch.associates) && Objects.equals(curriculum, batch.curriculum) && Objects.equals(resourceMetadata, batch.resourceMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId, batchName, startDate, endDate, trainerId, coTrainerId, associates, curriculum, resourceMetadata);
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
            ", resourceMetadata='" + getResourceMetadata() + "'" +
            "}";
    }
    
}