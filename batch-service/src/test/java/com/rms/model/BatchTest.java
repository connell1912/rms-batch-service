package com.rms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class BatchTest {
    @Before
    public void setup() {

    }

    @Test
    public void testConstructor() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        assertTrue(b.equals(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm)));
    }

    @Test
    public void testOtherConstructor() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch(1, "test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        assertTrue(b.equals(new Batch(1, "test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm)));
    }

    @Test
    public void testBatchNameGetter() {
        Batch b = new Batch();
        b.setBatchName("test");
        assertEquals("test", b.getBatchName());
    }

    @Test
    public void testStartDateGetter() {
        Batch b = new Batch();
        b.setStartDate(LocalDate.now());
        assertEquals(LocalDate.now(), b.getStartDate());
    }

    @Test
    public void testEndDateGetter() {
        Batch b = new Batch();
        b.setEndDate(LocalDate.now());
        assertEquals(LocalDate.now(), b.getEndDate());
    }

    @Test
    public void testTrainerIdGetter() {
        Batch b = new Batch();
        b.setTrainerId(1);
        assertEquals(1, b.getTrainerId());
    }

    @Test
    public void testCoTrainerIdGetter() {
        Batch b = new Batch();
        b.setCoTrainerId(1);
        assertEquals(1, b.getCoTrainerId());
    }

    @Test
    public void testAssociatesGetter() {
        Batch b = new Batch();
        b.setAssociates(15);
        assertEquals(15, b.getAssociates());
    }

    @Test
    public void testRmdGetter() {
        ResourceMetadata rm = new ResourceMetadata();
        Batch b = new Batch();
        b.setResourceMetadata(rm);
        assertEquals(rm, b.getResourceMetadata());
    }

}