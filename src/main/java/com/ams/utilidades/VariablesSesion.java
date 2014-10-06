/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.utilidades;

/**
 *
 * @author Walter Rizo
 */
public class VariablesSesion {
    
    private Integer usuario_id = 0;
    
    private Integer establecimiento_id = 0;
    
    private String db_user = "ams";
    
    private String db_password = "ams";

    public String getDb_user() {
        return db_user;
    }

    public String getDb_password() {
        return db_password;
    }

    public void setDb_user(String db_user) {
        this.db_user = db_user;
    }

    public void setDb_password(String db_password) {
        this.db_password = db_password;
    }
    
    public Integer getUsuario_id() {
        return usuario_id;
    }

    public Integer getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setEstablecimiento_id(Integer establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
    
    
    
}
