/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.jpacontroller;

import com.web.jpa.PacienteAsignadoMedico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author manza
 */
@Stateless
public class PacienteAsignadoMedicoFacade extends AbstractFacade<PacienteAsignadoMedico> {

    @PersistenceContext(unitName = "JPACitasMedicoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PacienteAsignadoMedicoFacade() {
        super(PacienteAsignadoMedico.class);
    }
    
}
