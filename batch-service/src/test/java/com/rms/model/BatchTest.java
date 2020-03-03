package com.rms.model;

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

}