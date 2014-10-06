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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private String user;
    private String password;
    
    public Conexion() {
    }

    public Conexion(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Conexion.conectar(user,password);
    }

    public static Connection conectar(String user,String password) throws ClassNotFoundException, SQLException {
        
        System.out.println("-------- PostgreSQL JDBC Conexion ------------");
        
            try { 
			Class.forName("org.postgresql.Driver");
                        System.out.println("PostgreSQL JDBC Driver Registrado!");    
		} catch (ClassNotFoundException e) {
 
			System.out.println("No se ha Encontrado el driver para PostgreSQL JDBC? "
					+ "Incluya el driver en el path de la libreria!");
			e.printStackTrace();
		}
        
            Connection connection = null;
 
            try {

                    connection = DriverManager.getConnection(
                                    "jdbc:postgresql://localhost:5432/ams_development", "ams",
                                    "ams");

            } catch (SQLException e) {

                    System.out.println("Conexion Fallida! Revisar la Consola!");
                    e.printStackTrace();

            }

            if (connection != null) {
                    System.out.println("Conexiona la Base de Datos Estabblecida!");
            } else {
                    System.out.println("Fallo al intento de establecer la conexions!");
            }

        return connection;
        
    }
    
    public static void main(String args[]){
        try {
            new Conexion().conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
