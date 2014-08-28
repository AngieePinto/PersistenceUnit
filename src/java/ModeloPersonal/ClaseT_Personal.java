/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloPersonal;


import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ESTACION
 */

@Entity
@Table(name="T_PERSONAL")

public class ClaseT_Personal {
    
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOMBRE", length = 100)
    private String nombre;
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
    @Column(name = "CEDULA")
    private Long cedula;
    @Column(name = "GENERO")
    private boolean genero;
    
    public ClaseT_Personal(){
    
    }
    public ClaseT_Personal(Integer id) {
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

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

}
