package com.portfolio.LeonelSaliol.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcerca {
    @NotBlank
    private String descrip;

    public dtoAcerca() {
    }

    public dtoAcerca(String descrip) {
        this.descrip = descrip;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
