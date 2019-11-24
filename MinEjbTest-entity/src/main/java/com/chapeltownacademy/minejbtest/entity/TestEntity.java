/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chapeltownacademy.minejbtest.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author sparry
 */
@Entity
@Table(name = "testentity")
@NamedQueries({
    @NamedQuery(name = "TestEntity.findAll", query = "SELECT t FROM TestEntity t"),
    @NamedQuery(name = "TestEntity.findByTestEntityId", query = "SELECT t FROM TestEntity t WHERE t.testEntityId = :testEntityId"),
    @NamedQuery(name = "TestEntity.findByName", query = "SELECT t FROM TestEntity t WHERE t.name = :name")})
public class TestEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "testEntityId")
    private Integer testEntityId;
    @Column(name = "name")
    private String name;

    public TestEntity() {
    }

    public TestEntity(Integer testEntityId) {
        this.testEntityId = testEntityId;
    }

    public Integer getTestEntityId() {
        return testEntityId;
    }

    public void setTestEntityId(Integer testEntityId) {
        this.testEntityId = testEntityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testEntityId != null ? testEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestEntity)) {
            return false;
        }
        TestEntity other = (TestEntity) object;
        if ((this.testEntityId == null && other.testEntityId != null) || (this.testEntityId != null && !this.testEntityId.equals(other.testEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chapeltownacademy.minejbtest.entity.TestEntity[ testEntityId=" + testEntityId + " ]";
    }
    
}
