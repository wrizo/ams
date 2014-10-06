/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ams.vistas.gestion_usuario.usuarios;

/**
 *
 * @author wrizo
 */
public class FormularioUsuariosN extends javax.swing.JPanel {

    /**
     * Creates new form FormularioUsuariosN
     */
    public FormularioUsuariosN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        jpfConfirmarPassword = new javax.swing.JPasswordField();
        DUPanel = new javax.swing.JPanel();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        AccionPanel = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();

        LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        lblPassword.setText("Contraseña:");

        jpfPassword.setToolTipText("");

        txtUsername.setToolTipText("Login de usuario.");

        lblUsername.setText("Username:");

        lblConfirmar.setText("Confirmar:");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword))
                .addGap(28, 28, 28)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpfConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(lblConfirmar)
                    .addComponent(jpfConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DUPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        lblPrimerNombre.setText("Primer Nombre:");

        txtPrimerNombre.setToolTipText("");

        lblSegundoNombre.setText("Segundo Nombre:");

        lblPrimerApellido.setText("Primer Apellido:");

        lblSegundoApellido.setText("Segundo Apellido:");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout DUPanelLayout = new javax.swing.GroupLayout(DUPanel);
        DUPanel.setLayout(DUPanelLayout);
        DUPanelLayout.setHorizontalGroup(
            DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DUPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DUPanelLayout.createSequentialGroup()
                        .addComponent(lblPrimerNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DUPanelLayout.createSequentialGroup()
                        .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrimerApellido)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrimerApellido)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DUPanelLayout.createSequentialGroup()
                        .addComponent(lblSegundoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DUPanelLayout.createSequentialGroup()
                        .addComponent(lblSegundoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSegundoApellido)))
                .addContainerGap())
        );
        DUPanelLayout.setVerticalGroup(
            DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DUPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerNombre)
                    .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoNombre)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerApellido)
                    .addComponent(lblSegundoApellido)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AccionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_32x32.png"))); // NOI18N
        btnCrear.setToolTipText("Crear Nuevo Registro.");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit-clear_32x32.png"))); // NOI18N
        btnLimpiar.setToolTipText(" Limpiar Campos de Texto.");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dialog-no_32x32.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar Ventana");

        javax.swing.GroupLayout AccionPanelLayout = new javax.swing.GroupLayout(AccionPanel);
        AccionPanel.setLayout(AccionPanelLayout);
        AccionPanelLayout.setHorizontalGroup(
            AccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AccionPanelLayout.setVerticalGroup(
            AccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionPanelLayout.createSequentialGroup()
                .addGroup(AccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ams/recursos/imagenes/top_sky-blue-background-abstract-images-blue-background.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DUPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DUPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccionPanel;
    private javax.swing.JPanel DUPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPasswordField jpfConfirmarPassword;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}