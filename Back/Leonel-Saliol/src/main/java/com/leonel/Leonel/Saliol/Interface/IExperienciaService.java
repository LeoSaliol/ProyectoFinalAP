package com.leonel.Leonel.Saliol.Interface;


import com.leonel.Leonel.Saliol.Entity.Experiencia;

import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getExperiencia();

    public void saveExperiencia(Experiencia experiencia);

    public void deleteExperiencia(Long id);

    public Experiencia findExperiencia(Long id);
}
