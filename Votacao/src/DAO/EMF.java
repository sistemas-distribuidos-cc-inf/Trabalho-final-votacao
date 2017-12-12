/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
    private static EntityManagerFactory emf;
    
    private EMF(){
    }
    
    public static EntityManagerFactory getEMF() throws Exception {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory( "VotacaoDAO" );
            return emf;
        } else {
            return emf;
        }
    }
}
