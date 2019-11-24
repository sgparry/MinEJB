/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chapeltownacademy.minejbtest.session;

import com.chapeltownacademy.minejbtest.entity.TestEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sparry
 */
@Stateless
public class TestEntityFacade extends AbstractFacade<TestEntity> implements TestEntityFacadeRemote {

    @PersistenceContext(unitName = "MINEJBTESTSESSION_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TestEntityFacade() {
        super(TestEntity.class);
    }
    
}
