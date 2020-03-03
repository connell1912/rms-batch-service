package com.rms.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class RmdTest {
    @Before
    public void setup() {

    }

    @Test
    public void testConstructor() {
        Timestamp t = new Timestamp(1000);
        Timestamp t2 = new Timestamp(2000);
        ResourceMetadata rm = new ResourceMetadata(1, t, 2, t2, 3);
        assertTrue(rm.equals(new ResourceMetadata(1, t, 2, t2, 3)));
    }

}