package com.mycompany.medicare;

import Controlador.ControladorPaciente;
import Modelo.Conexion;
import Modelo.PacienteDAO;
import Vista.FrmMenu;
import Vista.RegistroPaciente;
import javax.swing.UIManager;

public class MediCare {

    public static void main(String[] args) {
        try {
            // Establecer el Look and Feel a Metal
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            // Inicializar la conexión a la base de datos
            Conexion.getBaseDatos();

            // Crear e inicializar la vista del menú
            FrmMenu menu = new FrmMenu();

            // Crear e inicializar la vista de registro de paciente
            RegistroPaciente vistaRegistroPaciente = new RegistroPaciente();
            
            // Crear e inicializar el DAO y el controlador
            PacienteDAO pacienteDAO = new PacienteDAO();
            ControladorPaciente controlador = new ControladorPaciente(vistaRegistroPaciente, pacienteDAO);

            // Mostrar el menú
            menu.setVisible(true);

            // Mostrar la ventana de registro de paciente cuando se necesite
            menu.getBtnRegistrarPaciente().addActionListener(e -> {
                vistaRegistroPaciente.setVisible(true);
            });

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a MongoDB.");
        }
    }
}
