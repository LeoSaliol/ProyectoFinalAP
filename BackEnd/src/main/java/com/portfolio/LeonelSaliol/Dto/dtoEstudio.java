package com.portfolio.LeonelSaliol.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEstudio {
    @NotBlank
    private String nombreEs;
    @NotBlank
    private String descripcionEs;

    public dtoEstudio() {
    }

    public dtoEstudio(String nombreEs, String descripcionEs) {
        this.nombreEs = nombreEs;
        this.descripcionEs = descripcionEs;
    }

    public String getNombreEs() {
        return nombreEs;
    }

    public void setNombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }

    public String getDescripcionEs() {
        return descripcionEs;
    }

    public void setDescripcionEs(String descripcionEs) {
        this.descripcionEs = descripcionEs;
    }
}
