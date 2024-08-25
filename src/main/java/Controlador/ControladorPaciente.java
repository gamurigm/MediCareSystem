package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
import Vista.RegistroPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ControladorPaciente implements ActionListener {

    private final PacienteDAO pacienteDAO;
    private RegistroPaciente vista;

    public ControladorPaciente(RegistroPaciente vista, PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
        this.vista = vista;
        
        vista.getBtnGuardarPaciente().addActionListener(this);
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
       
    } else {
        
        JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}




    public void eliminarPaciente(String cedula) {
        try {
            pacienteDAO.eliminarPaciente(cedula);
            JOptionPane.showMessageDialog(null, "Paciente eliminado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarPaciente(String cedula, String nombre, String apellido, String genero, String direccion, String telefono, String correo) {
        try {
            Paciente paciente = new Paciente(cedula, nombre, apellido, genero, direccion, telefono, correo);
            pacienteDAO.actualizarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Paciente actualizado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el paciente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Paciente buscarPaciente(String cedula) {
        return pacienteDAO.obtenerPacientePorCedula(cedula);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnGuardarPaciente()) {
            guardarPaciente();
        }
    }
    
  
}
