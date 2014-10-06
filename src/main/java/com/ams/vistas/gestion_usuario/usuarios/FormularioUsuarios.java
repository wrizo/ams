/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ams.vistas.gestion_usuario.usuarios;

import com.ams.utilidades.Conexion;
import com.ams.utilidades.VariablesSesion;
import com.ams.utilidades.jUtils;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Sis17
 */


public class FormularioUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioUsuarios
     */
    
        // inicializacion de las variables de conexion
	static QueryTableModel qtm;
	@SuppressWarnings("rawtypes")
	Vector cache; // will hold String[] objects . . .
	int colCount; // contador de columnas
	String[] headers; // nombre de las columnas
	Connection db; // Conexion de la base de datos
	Statement statement; // ejecucion de sentencias
        
    public FormularioUsuarios() {
        
        initComponents();
        
        Border line = new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true);
        Border empty = new EmptyBorder(0, 10, 0, 0);
        CompoundBorder border = new CompoundBorder(line, empty);
        txtBuscar.setBorder(border);
        txtBuscar.setCaretColor(new java.awt.Color(102, 102, 102));
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       
        DocumentFilter filter = new UppercaseDocumentFilter();
        ((AbstractDocument) txtBuscar.getDocument()).setDocumentFilter(filter);
        
        qtm = new QueryTableModel();
  		 
    	qtm.initDB();
        qtm.setQuery("select id as \"ID\", user_name as \"NOMBRE DE USUARIO\", CONCAT_WS(' ', nombre1, nombre2, apellido1, apellido2) as \"NOMBRES Y APELLIDOS\", (CASE WHEN pasivo = false then 'SI' else 'NO' END) as \"ACTIVO\" from gestion_usuario.fn_buscar_usuarios_tfs('');");  		
        myTable.setModel(qtm);  		  
        qtm.closeDB();
  		    		  
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setResizable(false);
        
        myTable.getColumnModel().getColumn(1).setPreferredWidth(0);

    }
        
    class UppercaseDocumentFilter extends DocumentFilter {
        public void insertString(DocumentFilter.FilterBypass fb, int offset,
                String text, AttributeSet attr) throws BadLocationException {

            fb.insertString(offset, text.toUpperCase(), attr);
        }

        public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
                String text, AttributeSet attrs) throws BadLocationException {

            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }
        
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPanel = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        lblHeader = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");

        btnPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_32x32.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gtk-edit_32x32.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dialog-no_32x32.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(myTable);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        lblHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ams/recursos/imagenes/top_sky-blue-background-abstract-images-blue-background.jpg"))); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stock_search_16x16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit-clear_16x16.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    final class MostrarFormularioUsuariosE {

        private final JFrame frame;
        
        public MostrarFormularioUsuariosE(JFrame frame) {
            this.frame = frame;
        }

        public void cretaUI() {
            FormularioUsuariosE panel = new FormularioUsuariosE();
            JDialog dialog = new JDialog(frame);
            dialog.add(panel);
            dialog.setTitle("Dialog created without extending JDialog class.");
            dialog.setSize(new Dimension(400, 100));
            dialog.setLocationRelativeTo(frame);
            dialog.setModal(true);
            dialog.setVisible(true);
        }
    }

    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       // TODO add your handling code here:
            
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        FormularioUsuarios fu = new FormularioUsuarios();
        Window parentWindow = SwingUtilities.windowForComponent(fu); 
        // or pass 'this' if you are inside the panel
        JFrame parentFrame = null;
        if (parentWindow instanceof JFrame) {
            parentFrame = (JFrame)parentWindow;
        }

       MostrarFormularioUsuariosE mfe = new MostrarFormularioUsuariosE(parentFrame);
       mfe.cretaUI();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                buscarText();
            }        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarText();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtBuscar.setText("");
        qtm.initDB();
        qtm.setQuery("select id as \"ID\", user_name as \"NOMBRE DE USUARIO\", CONCAT_WS(' ', nombre1, nombre2, apellido1, apellido2) as \"NOMBRES Y APELLIDOS\", (CASE WHEN pasivo = false then 'SI' else 'NO' END) as \"ACTIVO\" from gestion_usuario.fn_buscar_usuarios_tfs('');");  		
        myTable.setModel(qtm);  		  
        qtm.closeDB();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void buscarText(){
        
        String sqlQuery = "";
	String searchText = "";
        
        if (txtBuscar.getText().length() == 0) {
                JOptionPane.showMessageDialog(null,
                                "Ingrese Texto en el campo de busqueda.");                
        } else {
                if (txtBuscar.getText().length() > 2) {

                        String L1 = txtBuscar.getText().trim();
                        String L2 = L1.replace("'", "");
                        String L3 = L2.replace("\"", "");
                        String L4 = L3.trim();                                                                      // "*");
                        searchText = L4;

                        System.out.println("Texto Parámetro: " + searchText);

                        sqlQuery = "select * from gestion_usuario.fn_buscar_usuarios_tfs('" + searchText.toString() + "');";
                                        
                } else {

                       JOptionPane.showMessageDialog(null,
                                "Ingrese Texto en el campo de busqueda, mayor que dos caracteres.");

                }

                 qtm.initDB();
                 qtm.setQuery(sqlQuery);
                 myTable.setModel(qtm);  		  
                 qtm.closeDB();

        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable myTable;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}


