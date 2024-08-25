package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
import Vista.FrmMenu;
import Vista.RegistroPaciente;
import com.mycompany.medicare.MediCare;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPaciente implements ActionListener {

    private final PacienteDAO pacienteDAO;
    private final RegistroPaciente vista;

    public ControladorPaciente(RegistroPaciente vista, PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
        this.vista = vista;
        
        vista.getBtnGuardarPaciente().addActionListener(this);
        vista.getBtnAtras().addActionListener(this);
    }

   private void guardarPaciente() {
        String cedula = vista.getTxtCedulaPaciente().getText();
        String nombre = vista.getTxtNombrePaciente().getText();
        String apellido = vista.getTxtApellidoPaciente().getText();
        String genero = vista.getGeneroPaciente().getSelectedValue(); 
        String direccion = vista.getTxtDireccionPaciente().getText();
        String telefono = vista.getTxtTelefonoPaciente().getText();
        String correo = vista.getTxtCorreoPaciente().getText();

        if (!cedula.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && genero != null &&
            !direccion.isEmpty() && !telefono.isEmpty() && !correo.isEmpty()) {

            Paciente paciente = new Paciente(cedula, nombre, apellido, genero, direccion, telefono, correo);
            pacienteDAO.crearPaciente(paciente);
            
            JOptionPane.showMessageDialog(vista, "Paciente guardado exitosamente.");
            
            // Limpia los campos de texto después de guardar
           // vista.limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnGuardarPaciente()) {
            guardarPaciente();
        }
        if (e.getSource() == vista.getBtnAtras()) {
            // Volver al menú y ocultar el registro de paciente
            MediCare.menu.setVisible(true);
            vista.dispose();
        }
    }
}
