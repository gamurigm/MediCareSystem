package Vista;

import Controlador.ControladorPaciente;
import Modelo.PacienteDAO;
import javax.swing.JButton;


public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnBuscarPaciente = new javax.swing.JButton();
        BtnRegistarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 2, 36)); // NOI18N
        jLabel1.setText("MediCareSystem");

        BtnBuscarPaciente.setText("Buscar Historia Clinica");
        BtnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPacienteActionPerformed(evt);
            }
        });

        BtnRegistarPaciente.setText("Registar Paciente");
        BtnRegistarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBuscarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRegistarPaciente))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscarPaciente)
                    .addComponent(BtnRegistarPaciente))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarPacienteActionPerformed
    

    }//GEN-LAST:event_BtnRegistarPacienteActionPerformed

    private void BtnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPacienteActionPerformed
        
    }//GEN-LAST:event_BtnBuscarPacienteActionPerformed

    public JButton getBtnRegistrarPaciente(){
        return  BtnRegistarPaciente;
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPaciente;
    private javax.swing.JButton BtnRegistarPaciente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
