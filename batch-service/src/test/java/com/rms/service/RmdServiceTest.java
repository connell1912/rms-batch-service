package com.rms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;

import com.rms.dao.RmdDao;
import com.rms.model.ResourceMetadata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RmdServiceTest {

    @InjectMocks
    RmdService rs;

    @Mock
    RmdDao rd;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveNewRmd() {
        Timestamp t = new Timestamp(1000);
        Timestamp t2 = new Timestamp(2000);
        ResourceMetadata rm = new ResourceMetadata(1, t, 2, t2, 3);
        rs.insert(rm);
        verify(rd, times(1)).save(rm);
    }

    @Test
    public void testUpdateRmd(){
        Timestamp t = new Timestamp(1000);
        Timestamp t2 = new Timestamp(2000);
        ResourceMetadata rm = new ResourceMetadata(1, t, 2, t2, 3);
        rs.insert(rm);
        ResourceMetadata rm2 = rd.findById(1);
        Timestamp t3 = new Timestamp(3000);
        rm2 = new ResourceMetadata(1, t, 2, t3, 3);
        rs.update(rm2);
        assertEquals(1, rm2.getResourceCreator());
    }

    @Test
    public void testUpdateRmdById(){
        Timestamp t = new Timestamp(1000);
        Timestamp t2 = new Timestamp(2000);
        ResourceMetadata rm = new ResourceMetadata(1, t, 2, t2, 3);
        rs.insert(rm);
        ResourceMetadata rm2 = rd.findById(1);
        Timestamp t3 = new Timestamp(3000);
        rm2 = new ResourceMetadata(1, t, 2, t3, 3);
        rs.updateById(1);
        assertEquals(1, rm2.getResourceCreator());
    }

}