/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manza
 */
@Entity
@Table(name = "paciente_asignado_medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteAsignadoMedico.findAll", query = "SELECT p FROM PacienteAsignadoMedico p")
    , @NamedQuery(name = "PacienteAsignadoMedico.findByIdAsignacionMedico", query = "SELECT p FROM PacienteAsignadoMedico p WHERE p.idAsignacionMedico = :idAsignacionMedico")
    , @NamedQuery(name = "PacienteAsignadoMedico.findByIdAsignacionPaciente", query = "SELECT p FROM PacienteAsignadoMedico p WHERE p.idAsignacionPaciente = :idAsignacionPaciente")})
public class PacienteAsignadoMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ID_ASIGNACION_MEDICO")
    private String idAsignacionMedico;
    @Size(max = 15)
    @Column(name = "ID_ASIGNACION_PACIENTE")
    private String idAsignacionPaciente;
    
    @ManyToMany
    private Collection<Paciente> pacienteCollection;
    @ManyToMany 
    private Collection<Medico> medicoCollection; 

    public PacienteAsignadoMedico() {
    }

    public PacienteAsignadoMedico(String idAsignacionMedico) {
        this.idAsignacionMedico = idAsignacionMedico;
    }

    public String getIdAsignacionMedico() {
        return idAsignacionMedico;
    }

    public void setIdAsignacionMedico(String idAsignacionMedico) {
        this.idAsignacionMedico = idAsignacionMedico;
    }

    public String getIdAsignacionPaciente() {
        return idAsignacionPaciente;
    }

    public void setIdAsignacionPaciente(String idAsignacionPaciente) {
        this.idAsignacionPaciente = idAsignacionPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacionMedico != null ? idAsignacionMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteAsignadoMedico)) {
            return false;
        }
        PacienteAsignadoMedico other = (PacienteAsignadoMedico) object;
        if ((this.idAsignacionMedico == null && other.idAsignacionMedico != null) || (this.idAsignacionMedico != null && !this.idAsignacionMedico.equals(other.idAsignacionMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.jpa.PacienteAsignadoMedico[ idAsignacionMedico=" + idAsignacionMedico + " ]";
    }
    
}
