package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Patologias {
    public class AntecedentePatologico {
    private List<String> enfermedadesPersonales;
    private List<String> enfermedadesFamiliares;

    public AntecedentePatologico() {
        this.enfermedadesPersonales = new ArrayList<>();
        this.enfermedadesFamiliares = new ArrayList<>();
    }

    public void agregarEnfermedadPersonal(String enfermedad) {
        enfermedadesPersonales.add(enfermedad);
    }

    public void agregarEnfermedadFamiliar(String enfermedad) {
        enfermedadesFamiliares.add(enfermedad);
    }

    // Getters (omitidos para brevedad)
    }
}
