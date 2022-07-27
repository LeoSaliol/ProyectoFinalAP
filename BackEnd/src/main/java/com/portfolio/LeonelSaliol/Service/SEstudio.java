package com.portfolio.LeonelSaliol.Service;

import com.portfolio.LeonelSaliol.Entity.Estudio;
import com.portfolio.LeonelSaliol.Repository.REstudio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SEstudio {
    @Autowired
    REstudio rEstudio;

    //Arma una lista de todos los estudios
    public List<Estudio> list(){
        return rEstudio.findAll();
    }

    // Busca uno por id y es opcional porque puede NO existir
    public Optional<Estudio> getOne(int id){
        return rEstudio.findById(id);
    }


    public Optional<Estudio> getByNombreEs(String nombreEs){
        return rEstudio.findByNombreEs(nombreEs);
    }

    //Trae un objeto para guardad
    public void save(Estudio estudio){
        rEstudio.save(estudio);
    }

    public void delete(int id){
        rEstudio.deleteById(id);
    }

    public boolean existsById(int id){
        return rEstudio.existsById(id);
    }

    public boolean existsByNombreEs(String nombreEs){
        return rEstudio.existsByNombreEs(nombreEs);
    }

}
