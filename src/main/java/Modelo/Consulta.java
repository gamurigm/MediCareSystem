package Modelo;

import Modelo.Patologias.AntecedentePatologico;
import java.util.Date;


public class Consulta {
    private Date fecha;
    private String antecedentesPatologicos;
    private String motivoConsulta;
    private SignosVitales signosVitales;
    private String examenFisico;
    private Diagnostico diagnostico;
    private Tratamiento tratamiento;
    private Doctor medico;

    public Consulta(Date fecha, String antecedentesPatologicos, String motivoConsulta, SignosVitales signosVitales, String examenFisico, Diagnostico diagnostico, Tratamiento tratamiento, Doctor medico) {
        this.fecha = fecha;
        this.antecedentesPatologicos = antecedentesPatologicos;
        this.motivoConsulta = motivoConsulta;
        this.signosVitales = signosVitales;
        this.examenFisico = examenFisico;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAntecedentesPatologicos() {
        return antecedentesPatologicos;
    }

    public void setAntecedentesPatologicos(String antecedentesPatologicos) {
        this.antecedentesPatologicos = antecedentesPatologicos;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public SignosVitales getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Doctor getMedico() {
        return medico;
    }

    public void setMedico(Doctor medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulta{" + "fecha=" + fecha + ", antecedentesPatologicos=" + antecedentesPatologicos + ", motivoConsulta=" + motivoConsulta + ", signosVitales=" + signosVitales + ", examenFisico=" + examenFisico + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", medico=" + medico + '}';
    }


}
