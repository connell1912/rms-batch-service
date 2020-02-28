package com.rms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int resourceCreator;

    @Column
    private String resourceCreatorDateTime;

    @Column
    private int lastModifier;

    @Column
    private String lastModifiedDateTime;

    @Column
    private int resourceOwner;
}