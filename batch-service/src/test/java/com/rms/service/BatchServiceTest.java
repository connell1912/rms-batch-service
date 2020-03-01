package com.rms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.rms.dao.BatchDao;
import com.rms.model.Batch;
import com.rms.model.Curriculum;
import com.rms.model.ResourceMetadata;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BatchServiceTest {

    @InjectMocks
    BatchService bs;

    @Mock
    BatchDao bd;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveNewBatch() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.insert(b);
        verify(bd, times(1)).save(b);
    }

    @Test
    public void testFindBatchById() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findById(1)).thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm));
        Batch b = bs.findBatchById(1);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

    @Test
    public void testReadAllBatches() {
        Iterable<Batch> b = bs.readAll();
        assertNotNull(b);
    }

    @Test
    public void testUpdateBatch() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        b2 = new Batch("test-name2", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.update(b2);
        assertEquals("test-name2", b2.getBatchName());
    }

    @Test
    public void testDeleteBatch() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        bs.delete(b2);
        Batch b3 = bs.findBatchById(1);
        assertFalse(b3 != null);
    }

    @Test
    public void testUpdateById() {
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        b2 = new Batch("test-name2", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.updateById(1);
        assertEquals("test-name2", b2.getBatchName());
    }

    @Test
    public void testDeleteById(){
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm);
        bs.insert(b);
        bs.deleteById(1);
        Batch b2 = bs.findBatchById(1);
        assertFalse(b2 != null);
    }

    // doesn't work
    @Test
    public void testFindByDate(){
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findById(1)).thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm));
        Batch b = bs.findByDate(LocalDate.now());
        assertEquals("test-name", b.getBatchName());
        assertEquals(1, b.getTrainerId());
        assertEquals(1, b.getCoTrainerId());
    }

    // doesn't work
    @Test
    public void testFindByCurriculum(){
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findById(1)).thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm));
        Batch b = bs.findByCurriculum(Curriculum.JAVA_MSA);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

    // doesn't work
    @Test
    public void testFindByTrainer(){
        ResourceMetadata rm = new ResourceMetadata();
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findById(1)).thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA, rm));
        Batch b = bs.findByTrainer(1);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

}