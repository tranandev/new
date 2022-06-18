package com.example.demo3.model;

import javax.persistence.*;
import java.util.Date;
@MappedSuperclass

public abstract class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "createdby")
    private String createdBy;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "modifiedby")
    private String modifiedBy;
    @Column(name = "modifieddate")
    private Date modifieDdate;

    public Long getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifieDdate() {
        return modifieDdate;
    }

    public void setModifieDdate(Date modifieDdate) {
        this.modifieDdate = modifieDdate;
    }
}

