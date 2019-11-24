/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chapeltownacademy.minejbtest.session;

import com.chapeltownacademy.minejbtest.entity.TestEntity;
import java.util.List;

/**
 *
 * @author sparry
 */
@javax.ejb.Remote
public interface TestEntityFacadeRemote {

    void create(com.chapeltownacademy.minejbtest.entity.TestEntity testEntity);

    void edit(com.chapeltownacademy.minejbtest.entity.TestEntity testEntity);

    void remove(com.chapeltownacademy.minejbtest.entity.TestEntity testEntity);

    com.chapeltownacademy.minejbtest.entity.TestEntity find(Object id);

    List<TestEntity> findAll();

    List<TestEntity> findRange(int[] range);

    int count();
    
}
