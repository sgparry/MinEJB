package com.chapeltownacademy.minejbtest.remoteclient;

import com.chapeltownacademy.minejbtest.entity.TestEntity;
import com.chapeltownacademy.minejbtest.session.TestEntityFacadeRemote;
import javax.ejb.EJB;

/**
 * Enterprise Application Client main class.
 *
 */
public class Main {
    @EJB
    public static TestEntityFacadeRemote testEntityFacade;
    public static void main( String[] args ) {
        System.out.println( "Hello World Enterprise Application Client!" );
        TestEntity testEntity = testEntityFacade.find(1);
        System.out.println( testEntity.getName() );
    }
}
