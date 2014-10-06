/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ams.utilidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sis17
 */
public class jUtils {
    
    private  String Query = null;
    private  Connection conn = null;
    private  PreparedStatement pstmnt = null;
    private  ResultSet rs = null;
    
    public String stringToMd5(String var){      
       
        String resultado = "";
       
        VariablesSesion vs = new VariablesSesion();
        
        String pUsuario = vs.getDb_user();
        String pPassword = vs.getDb_password();
        
        // Obtener Conexion.
        try {
             conn = Conexion.conectar(pUsuario, pPassword);
        } catch (Exception e) {
                System.out
                          .println("No se pudo establecer conexión con la base de datos.");
                e.printStackTrace();
        }
        
         try {
            
                Query = "SELECT md5(?) as text;";
                pstmnt = conn.prepareStatement(Query);
                pstmnt.setString(1, var);
                rs = pstmnt.executeQuery();
                
                while(rs.next()){
                    resultado = rs.getString("text");                
                }
                                
            } catch (SQLException ex) {
                ex.printStackTrace();                        
            } finally {
                // Cierra las conexiones y reinicia las variables
                if (rs != null) {
                        try {
                                pstmnt.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                else if (pstmnt != null) {
                        try {
                                pstmnt.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                else if (conn != null) {
                        try {
                                conn.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }
       
       return resultado;
              
    }
    
}
