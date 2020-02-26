package com.rms.testing;

import com.rms.model.Batch;
import com.rms.model.Curriculum;
import com.rms.service.BatchService;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.time.LocalDate;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class Testing {

    BatchService bs = new BatchService();

    public void testInsertBatch() {
        LocalDate today = LocalDate.now();
        LocalDate later = today.plusMonths(3);
        int[] associates = new int[20];
        Curriculum c = Curriculum.JAVA_MSA;
        // Batch b = new Batch(0, "TestBatch", today, later, 1, 1, associates, c);
        // bs.insert(b);
        
    }

    public void testUpdateBatch() {
        
    }

    public void testReadBatch() {
        
    }
}
