package com.rms.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {

    public final Logger log = Logger.getLogger(AspectClass.class.getName());

    @After("execution(* addNewBatch(..))")
    public void adviceMethodForInsertingBatch(JoinPoint jp){
        log.info("A new batch has been inserted.");
    }

    @After("execution(* updateBatch(..))")
    public void adviceMethodForUpdateBatch(JoinPoint jp) {
        log.info("A batch has been updated.");
    }

    @After("execution(* deleteBatch(..))")
    public void adviceMethodForDeletingBatch(JoinPoint jp) {
        log.info("A batch has been deleted.");
    }
    
    @After("execution(* readAllBatches(..))")
    public void adviceMethodForReadingAllBatches(JoinPoint jp) {
        log.info("All batches have been read.");   
    }

    @After("execution(* updateById(..))")
    public void adviceMethodForUpdatingById(JoinPoint jp) {
        log.info("A batch has been updated by its id.");
    }
}
