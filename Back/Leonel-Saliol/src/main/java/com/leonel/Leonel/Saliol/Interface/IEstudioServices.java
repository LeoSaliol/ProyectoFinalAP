package com.leonel.Leonel.Saliol.Interface;

import com.leonel.Leonel.Saliol.Entity.Estudio;

import java.util.List;

public interface IEstudioServices {

    public List<Estudio> getEstudio();

    public void saveEstudio(Estudio estudio);

    public void deleteEstudio(Long id);

    public Estudio findEstudio(Long id);
}
