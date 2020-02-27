package com.rms.model;

import javax.persistence.Entity;
import javax.persistence.Table;


public enum Curriculum {
    JAVA_MSA, CSHARP, PEGA, JTA, REACT, AI, MOBILE

    // public int toId(Curriculum c) {
    //     switch (c) {
    //         case JAVA_MSA: return 1;
    //         case CSHARP: return 2;
    //         case PEGA: return 3;
    //         case JTA: return 4;
    //         case REACT: return 5;
    //         case AI: return 6;
    //         case MOBILE: return 7;
    //         default: return -1;
    //     }
    // }
}