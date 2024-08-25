package Modelo;

import Modelo.Patologias.AntecedentePatologico;
import java.util.Date;


public class VisitaMedica {
    private Date fechaVisita;
    private Patologias antecedentesPatologicos;
    private String motivoConsulta;
    private final SignosVitales signosVitales;
    private final AntecedentePatologico Patologias;

    public VisitaMedica(Date fechaVisita, AntecedentePatologico antecedentesPatologicos,
                        String motivoConsulta, SignosVitales signosVitales) {
        this.fechaVisita = fechaVisita;
        this.Patologias = antecedentesPatologicos;
        this.motivoConsulta = motivoConsulta;
        this.signosVitales = signosVitales;
    }


}
