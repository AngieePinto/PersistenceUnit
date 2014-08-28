/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ESTACION
 */
@Entity
@Table(name = "T_PERSONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TPersonal.findAll", query = "SELECT t FROM TPersonal t"),
    @NamedQuery(name = "TPersonal.findById", query = "SELECT t FROM TPersonal t WHERE t.id = :id"),
    @NamedQuery(name = "TPersonal.findByNombre", query = "SELECT t FROM TPersonal t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TPersonal.findByTelefono", query = "SELECT t FROM TPersonal t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "TPersonal.findByCedula", query = "SELECT t FROM TPersonal t WHERE t.cedula = :cedula"),
    @NamedQuery(name = "TPersonal.findByGenero", query = "SELECT t FROM TPersonal t WHERE t.genero = :genero")})
public class TPersonal implements Serializable {
  
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOMBRE", length = 100)
    private String nombre;
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
    @Column(name = "CEDULA")
    private Long cedula;
    @Column(name = "GENERO")
    private Serializable genero;

    public TPersonal() {
    }

    public TPersonal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public Serializable getGenero() {
        return genero;
    }

    public void setGenero(Serializable genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TPersonal)) {
            return false;
        }
        TPersonal other = (TPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TPersonal[ id=" + id + " ]";
    }
    
}
