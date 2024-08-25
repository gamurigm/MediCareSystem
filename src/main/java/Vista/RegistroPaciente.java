package Vista;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class RegistroPaciente extends javax.swing.JFrame {

    public RegistroPaciente() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtNombrePaciente = new javax.swing.JTextField();
        lblNombrePaciente = new javax.swing.JLabel();
        lblCedulaPaciente = new javax.swing.JLabel();
        TxtCedulaPaciente = new javax.swing.JTextField();
        lblTelefonoPaciente = new javax.swing.JLabel();
        TxtTelefonoPaciente = new javax.swing.JTextField();
        lblGeneroPaciente = new javax.swing.JLabel();
        TxtDireccionPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGenero = new javax.swing.JList<>();
        lblDireccionPaciente = new javax.swing.JLabel();
        lblCorreoPaciente = new javax.swing.JLabel();
        TxtCorreoPaciente = new javax.swing.JTextField();
        btnGuardarPaciente = new javax.swing.JButton();
        TxtApellidoPaciente = new javax.swing.JTextField();
        lblNombrePaciente1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Pacientes");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(2, 232, 250));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 153, 255));

        TxtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombrePacienteActionPerformed(evt);
            }
        });

        lblNombrePaciente.setText("Nombre:");

        lblCedulaPaciente.setText("CI:");

        TxtCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaPacienteActionPerformed(evt);
            }
        });

        lblTelefonoPaciente.setText("Teléfono:");

        lblGeneroPaciente.setText("Genero:");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel5.setText("Registro de Pacientes");

        listGenero.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "M", "F", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listGenero);

        lblDireccionPaciente.setText("Dirección:");

        lblCorreoPaciente.setText("Correo:");

        btnGuardarPaciente.setText("Guardar");
        btnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPacienteActionPerformed(evt);
            }
        });

        TxtApellidoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoPacienteActionPerformed(evt);
            }
        });

        lblNombrePaciente1.setText("Apellidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(TxtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(TxtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(TxtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGeneroPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccionPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TxtDireccionPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCorreoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(268, 268, 268))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCorreoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNombrePaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(TxtApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePaciente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedulaPaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGeneroPaciente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDireccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCorreoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoPaciente))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPaciente)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombrePacienteActionPerformed

    private void TxtCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaPacienteActionPerformed

    private void TxtApellidoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPacienteActionPerformed

    private void btnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarPacienteActionPerformed

 
    public JButton getBtnGuardarPaciente() {
        return btnGuardarPaciente;
    }
    
    public JTextField getTxtCedulaPaciente(){
        return TxtCedulaPaciente;
    }
    
    public JTextField getTxtNombrePaciente(){
        return TxtNombrePaciente;
    }
    
    public JTextField getTxtApellidoPaciente(){
        return TxtApellidoPaciente;
    }
    
    public JList<String> getGeneroPaciente(){
        return listGenero;
    }
    
    
    public JTextField getTxtDireccionPaciente(){
        return TxtDireccionPaciente;
    }
    
    public JTextField getTxtTelefonoPaciente(){
        return TxtTelefonoPaciente;
    }
    
    public JTextField getTxtCorreoPaciente(){
        return TxtCorreoPaciente;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellidoPaciente;
    private javax.swing.JTextField TxtCedulaPaciente;
    private javax.swing.JTextField TxtCorreoPaciente;
    private javax.swing.JTextField TxtDireccionPaciente;
    private javax.swing.JTextField TxtNombrePaciente;
    private javax.swing.JTextField TxtTelefonoPaciente;
    private javax.swing.JButton btnGuardarPaciente;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaPaciente;
    private javax.swing.JLabel lblCorreoPaciente;
    private javax.swing.JLabel lblDireccionPaciente;
    private javax.swing.JLabel lblGeneroPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblNombrePaciente1;
    private javax.swing.JLabel lblTelefonoPaciente;
    private javax.swing.JList<String> listGenero;
    // End of variables declaration//GEN-END:variables
}
