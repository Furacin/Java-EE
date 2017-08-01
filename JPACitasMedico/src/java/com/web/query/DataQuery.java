/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.query;
import com.web.jpa.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author manza
 */
public class DataQuery {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public DataQuery() {
        emf = Persistence.createEntityManagerFactory("JPACitasMedicoPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public boolean loginControl(String username, String password) {
        try  {
            Usuario u = em.createNamedQuery("Usuario.control", Usuario.class).setParameter("username",username).setParameter("password",password).getSingleResult();
            if (u != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
