/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.utilidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Walter Rizo
 */
public class ConstructorTablas {
    
       
    // inicializacion de las variables de conexion
    static QueryTableModel qtm;
    @SuppressWarnings("rawtypes")
    Vector cache; // will hold String[] objects . . .
    int colCount; // contador de columnas
    String[] headers; // nombre de las columnas
    Connection db; // Conexion de la base de datos
    Statement statement; // ejecucion de sentencias


    public class QueryTableModel extends AbstractTableModel {

            /**
             * 
             */

            private static final long serialVersionUID = 1L;
            
            VariablesSesion vs = new VariablesSesion();
    
            public String db_usuario = vs.getDb_user();

            public String  db_password = vs.getDb_password();
            
            Conexion con = new Conexion();
               

            @SuppressWarnings("rawtypes")
            public QueryTableModel() {
                    cache = new Vector();
            }

            public String getColumnName(int i) {
                    return headers[i];
            }

            public int getColumnCount() {
                    return colCount;
            }

            public int getRowCount() {
                    return cache.size();
            }

            public Object getValueAt(int row, int col) {
                    return ((String[]) cache.elementAt(row))[col];
            }

            // All the real work happens here; in a real application,
            // we'd probably perform the query in a separate thread.
            @SuppressWarnings({ "rawtypes", "unchecked" })
            public void setQuery(String q) {
                    cache = new Vector();
                    try {
                            // Execute the query and store the result set and its metadata
                            ResultSet rs = statement.executeQuery(q);
                            ResultSetMetaData meta = rs.getMetaData();
                            colCount = meta.getColumnCount();

                            // Now we must rebuild the headers array with the new column
                            // names
                            headers = new String[colCount];
                            for (int h = 1; h <= colCount; h++) {
                                    headers[h - 1] = meta.getColumnName(h);
                            }

                            // and file the cache with the records from our query. This
                            // would
                            // not be
                            // practical if we were expecting a few million records in
                            // response
                            // to our
                            // query, but we aren't, so we can do this.
                            while (rs.next()) {
                                    String[] record = new String[colCount];
                                    for (int i = 0; i < colCount; i++) {
                                            record[i] = rs.getString(i + 1);
                                    }
                                    cache.addElement(record);
                            }
                            fireTableChanged(null); // notify everyone that we have a new
                                                                            // table.
                    } catch (Exception e) {
                            cache = new Vector(); // blank it out and keep going.
                            e.printStackTrace();
                    }
            }

            public void initDB() {
                    try {
                            db = Conexion.conectar(db_usuario, db_password);
                            statement = db.createStatement();
                    } catch (Exception e) {
                            System.out
                                            .println("No se pudo Iniciar la conexión con la base de datos.");
                            e.printStackTrace();
                    }
            }

            public void closeDB() {
                    try {
                            if (statement != null) {
                                    statement.close();
                            }
                            if (db != null) {
                                    db.close();
                            }
                    } catch (Exception e) {
                            System.out.println("No se pudo cerrar la conexión.");
                            e.printStackTrace();
                    }
            }

    }

    
}
