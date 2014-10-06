package com.ams.modelo.gestion_usuario;
// Generated 10-02-2014 02:11:14 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Permisos generated by hbm2java
 */
@Entity
@Table(name="permisos"
    , uniqueConstraints = @UniqueConstraint(columnNames={"rol_id", "usuario_id", "establecimiento_id"}) 
)
public class Permisos  implements java.io.Serializable {


     private int id;
     private Roles roles;
     private Usuarios usuarios;
     private Integer establecimientoId;
     private Date creadoEl;
     private Date modificadoEl;
     private Integer creadoPor;
     private Integer modificadoPor;
     private String creadoEnIp;
     private String modificadoEnIp;

    public Permisos() {
    }

	
    public Permisos(int id) {
        this.id = id;
    }
    public Permisos(int id, Roles roles, Usuarios usuarios, Integer establecimientoId, Date creadoEl, Date modificadoEl, Integer creadoPor, Integer modificadoPor, String creadoEnIp, String modificadoEnIp) {
       this.id = id;
       this.roles = roles;
       this.usuarios = usuarios;
       this.establecimientoId = establecimientoId;
       this.creadoEl = creadoEl;
       this.modificadoEl = modificadoEl;
       this.creadoPor = creadoPor;
       this.modificadoPor = modificadoPor;
       this.creadoEnIp = creadoEnIp;
       this.modificadoEnIp = modificadoEnIp;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rol_id")
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_id")
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    @Column(name="establecimiento_id")
    public Integer getEstablecimientoId() {
        return this.establecimientoId;
    }
    
    public void setEstablecimientoId(Integer establecimientoId) {
        this.establecimientoId = establecimientoId;
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




}

