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
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.insert(b);
        verify(bd, times(1)).save(b);
    }

    @Test
    public void testFindBatchById() {
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findById(1)).thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA));
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
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        b2 = new Batch("test-name2", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.update(b2);
        assertEquals("test-name2", b2.getBatchName());
    }

    @Test
    public void testDeleteBatch() {
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        bs.delete(b2);
        Batch b3 = bs.findBatchById(1);
        assertFalse(b3 != null);
    }

    @Test
    public void testUpdateById() {
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.insert(b);
        Batch b2 = bs.findBatchById(1);
        b2 = new Batch("test-name2", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.updateById(1);
        assertEquals("test-name2", b2.getBatchName());
    }

    @Test
    public void testDeleteById(){
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        Batch b = new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA);
        bs.insert(b);
        bs.deleteById(1);
        Batch b2 = bs.findBatchById(1);
        assertFalse(b2 != null);
    }

    @Test
    public void testFindByDate(){
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findByStartDateBefore(start))
                .thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA));
        Batch b = bs.findByDate(start);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

    @Test
    public void testFindByCurriculum(){
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findByCurriculumEquals(Curriculum.JAVA_MSA))
                .thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA));
        Batch b = bs.findByCurriculum(Curriculum.JAVA_MSA);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

    @Test
    public void testFindByTrainer(){
        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusMonths(3);
        when(bd.findByTrainerIdEquals(1))
                .thenReturn(new Batch("test-name", start, finish, 1, 1, 20, Curriculum.JAVA_MSA));
        Batch b = bs.findByTrainer(1);
        assertEquals("test-name", b.getBatchName());
        assertEquals(start, b.getStartDate());
        assertEquals(finish, b.getEndDate());
    }

}