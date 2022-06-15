package com.leonel.Leonel.Saliol.Interface;


import com.leonel.Leonel.Saliol.Entity.Acerca;



public interface IAcercaService {





    public void saveAcercaDeMi (Acerca acerca);

    public void deleteAcerDeMi(Long id);

    public Acerca findAcerca(Long id);
}
