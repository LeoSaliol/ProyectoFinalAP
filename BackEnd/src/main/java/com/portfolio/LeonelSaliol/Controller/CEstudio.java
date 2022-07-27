package com.portfolio.LeonelSaliol.Controller;

import com.portfolio.LeonelSaliol.Dto.dtoEstudio;
import com.portfolio.LeonelSaliol.Entity.Estudio;
import com.portfolio.LeonelSaliol.Security.Controller.Mensaje;
import com.portfolio.LeonelSaliol.Service.SEstudio;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudio")
@CrossOrigin(origins = "http://localhost:4200")

public class CEstudio {
    @Autowired
    SEstudio sEstudio;

    @GetMapping("/lista")
    public ResponseEntity<List<Estudio>> list(){
        List<Estudio> list = sEstudio.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Estudio> getById(@PathVariable("id") int id){
        if(!sEstudio.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Estudio estudio = sEstudio.getOne(id).get();
        return new ResponseEntity(estudio, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEstudio dtoest){
        if (StringUtils.isBlank(dtoest.getNombreEs()))
            return new ResponseEntity<>(new Mensaje("El nombre es Obligatorio"),HttpStatus.BAD_REQUEST);
        if (sEstudio.existsByNombreEs(dtoest.getNombreEs()))
            return new ResponseEntity<>(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        Estudio estudio = new Estudio(dtoest.getNombreEs(), dtoest.getDescripcionEs());
        sEstudio.save(estudio);
        return new ResponseEntity<>(new Mensaje("Estudio agregada correctamente"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable("id") int id,
                                   @RequestBody  dtoEstudio dtoEst){
        if (!sEstudio.existsById(id))
            return new ResponseEntity<>(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        if (sEstudio.existsByNombreEs(dtoEst.getNombreEs()) && sEstudio.getByNombreEs(dtoEst.getNombreEs()).get().getId() != id)
            return new ResponseEntity<>(new Mensaje("Estudio ya existe"), HttpStatus.BAD_REQUEST);
        if (StringUtils.isBlank(dtoEst.getNombreEs()))
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        Estudio estudio = sEstudio.getOne(id).get();
        estudio.setNombreEs(dtoEst.getNombreEs());
        estudio.setDescripcionEs(dtoEst.getDescripcionEs());
        sEstudio.save(estudio);
        return new ResponseEntity<>(new Mensaje("Estudio actualizada"), HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>delete(@PathVariable("id") int id){
        if (!sEstudio.existsById(id))
            return new ResponseEntity<>(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        sEstudio.delete(id);
        return new ResponseEntity<>(new Mensaje("El estudio fue borrada correctamente"), HttpStatus.OK);
    }
}
