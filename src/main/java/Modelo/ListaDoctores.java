package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaDoctores {
    private List<Doctor> doctores;

    public ListaDoctores() {
        this.doctores = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        this.doctores.add(doctor);
    }

    public void eliminarDoctorPorCedula(String cedula) {
        this.doctores.removeIf(doctor -> doctor.getCedula().equals(cedula));
    }

    public Doctor buscarDoctorPorCedula(String cedula) {
        for (Doctor doctor : doctores) {
            if (doctor.getCedula().equals(cedula)) {
                return doctor;
            }
        }
        return null;
    }

    public List<Doctor> obtenerListaDoctores() {
        return doctores;
    }
}
