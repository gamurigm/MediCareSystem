package com.mycompany.medicare;

import Controlador.ControladorPaciente;
import Modelo.Conexion;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import Modelo.Vista.RegistroPaciente;


public class MediCare {

    public static void main(String[] args) {
        try {
            // Inicializa la conexión con la base de datos
            Conexion.getBaseDatos();

            // Instancia las vistas, modelos y controladores
            RegistroPaciente vista = new RegistroPaciente();
            PacienteDAO pacienteDAO = new PacienteDAO();
            ControladorPaciente controlador = new ControladorPaciente(vista, pacienteDAO);

            // Muestra la interfaz gráfica
            vista.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a MongoDB.");
        } finally {
            // Cerrar la conexión
            //Conexion.close();
        }
    }
}
