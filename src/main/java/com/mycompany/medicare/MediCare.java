package com.mycompany.medicare;

import Controlador.ControladorPaciente;
import Modelo.Conexion;
import Modelo.PacienteDAO;
import Vista.FrmMenu;
import Vista.RegistroPaciente;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;

public class MediCare {

    public static FrmMenu menu;
    private static RegistroPaciente vistaRegistroPaciente;
    private static PacienteDAO pacienteDAO;
    private static ControladorPaciente controladorPaciente;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                inicializarApp();
            } catch (Exception e) {
                mostrarError("Error al iniciar la aplicación");
                e.printStackTrace();
            }
        });
    }

    private static void inicializarApp() throws Exception {
        // Establecer el Look and Feel a Metal
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Metal".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

        Conexion.getBaseDatos();

        // Crear instancia de vistas y DAO
        menu = new FrmMenu();
        vistaRegistroPaciente = new RegistroPaciente();
        pacienteDAO = new PacienteDAO();

        // Crear controlador
        controladorPaciente = new ControladorPaciente(vistaRegistroPaciente, pacienteDAO);

        // Configurar el botón para abrir la ventana de registro de paciente
        menu.getBtnRegistrarPaciente().addActionListener(e -> {
            vistaRegistroPaciente.setVisible(true);
            menu.setVisible(false); // Cerrar el menú cuando se abre el registro
        });

        // Mostrar el menú
        menu.setVisible(true);
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
