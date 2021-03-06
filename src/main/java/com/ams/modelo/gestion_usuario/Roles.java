package com.ams.modelo.gestion_usuario;
// Generated 10-02-2014 02:11:14 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name="roles"
    , uniqueConstraints = @UniqueConstraint(columnNames="nombre") 
)
public class Roles  implements java.io.Serializable {


     private int id;
     private String nombre;
     private Boolean pasivo;
     private Date creadoEl;
     private Date modificadoEl;
     private Integer creadoPor;
     private Integer modificadoPor;
     private String creadoEnIp;
     private String modificadoEnIp;
     private Set rolesMenuses = new HashSet(0);
     private Set permisoses = new HashSet(0);

    public Roles() {
    }

	
    public Roles(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Roles(int id, String nombre, Boolean pasivo, Date creadoEl, Date modificadoEl, Integer creadoPor, Integer modificadoPor, String creadoEnIp, String modificadoEnIp, Set rolesMenuses, Set permisoses) {
       this.id = id;
       this.nombre = nombre;
       this.pasivo = pasivo;
       this.creadoEl = creadoEl;
       this.modificadoEl = modificadoEl;
       this.creadoPor = creadoPor;
       this.modificadoPor = modificadoPor;
       this.creadoEnIp = creadoEnIp;
       this.modificadoEnIp = modificadoEnIp;
       this.rolesMenuses = rolesMenuses;
       this.permisoses = permisoses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre", unique=true, nullable=false, length=100)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="pasivo")
    public Boolean getPasivo() {
        return this.pasivo;
    }
    
    public void setPasivo(Boolean pasivo) {
        this.pasivo = pasivo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creado_el", length=29)
    public Date getCreadoEl() {
        return this.creadoEl;
    }
    
    public void setCreadoEl(Date creadoEl) {
        this.creadoEl = creadoEl;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modificado_el", length=29)
    public Date getModificadoEl() {
        return this.modificadoEl;
    }
    
    public void setModificadoEl(Date modificadoEl) {
        this.modificadoEl = modificadoEl;
    }

    
    @Column(name="creado_por")
    public Integer getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(Integer creadoPor) {
        this.creadoPor = creadoPor;
    }

    
    @Column(name="modificado_por")
    public Integer getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(Integer modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    
    @Column(name="creado_en_ip", length=20)
    public String getCreadoEnIp() {
        return this.creadoEnIp;
    }
    
    public void setCreadoEnIp(String creadoEnIp) {
        this.creadoEnIp = creadoEnIp;
    }

    
    @Column(name="modificado_en_ip", length=20)
    public String getModificadoEnIp() {
        return this.modificadoEnIp;
    }
    
    public void setModificadoEnIp(String modificadoEnIp) {
        this.modificadoEnIp = modificadoEnIp;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set getRolesMenuses() {
        return this.rolesMenuses;
    }
    
    public void setRolesMenuses(Set rolesMenuses) {
        this.rolesMenuses = rolesMenuses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set getPermisoses() {
        return this.permisoses;
    }
    
    public void setPermisoses(Set permisoses) {
        this.permisoses = permisoses;
    }




}


