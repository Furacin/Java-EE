/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manza
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")
    , @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita")
    , @NamedQuery(name = "Cita.findByPacienteCita", query = "SELECT c FROM Cita c WHERE c.pacienteCita = :pacienteCita")
    , @NamedQuery(name = "Cita.findByMedicoCita", query = "SELECT c FROM Cita c WHERE c.medicoCita = :medicoCita")
    , @NamedQuery(name = "Cita.findByFechaHora", query = "SELECT c FROM Cita c WHERE c.fechaHora = :fechaHora")
    , @NamedQuery(name = "Cita.findByMotivoCita", query = "SELECT c FROM Cita c WHERE c.motivoCita = :motivoCita")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CITA")
    private Integer idCita;
    @Size(max = 15)
    @Column(name = "PACIENTE_CITA")
    private String pacienteCita;
    @Size(max = 15)
    @Column(name = "MEDICO_CITA")
    private String medicoCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MOTIVO_CITA")
    private String motivoCita;
    
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Medico medico;
    @OneToOne
    private Diagnostico diagnostico;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, Date fechaHora, String motivoCita) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.motivoCita = motivoCita;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getPacienteCita() {
        return pacienteCita;
    }

    public void setPacienteCita(String pacienteCita) {
        this.pacienteCita = pacienteCita;
    }

    public String getMedicoCita() {
        return medicoCita;
    }

    public void setMedicoCita(String medicoCita) {
        this.medicoCita = medicoCita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.jpa.Cita[ idCita=" + idCita + " ]";
    }
    
}
