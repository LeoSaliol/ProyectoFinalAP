package com.leonel.Leonel.Saliol.Controller;


import com.leonel.Leonel.Saliol.Entity.Experiencia;
import com.leonel.Leonel.Saliol.Interface.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ExperienciaController {

    @Autowired
    IExperienciaService iexperienciaService;


    @GetMapping("experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }

    @PostMapping("experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }

    @DeleteMapping("experiencias/borrar/{id}")
    public String deleteExperiencias(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }

    @PutMapping("experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                       @RequestParam("nomTra") String nuevoNom,
                                       @RequestParam("fechaIni") String nuevoFI,
                                       @RequestParam("fechaFin") String nuevoFF,
                                       @RequestParam("descripcion") String nuevaDescripcion
                                       ){
        Experiencia experiencia = iexperienciaService.findExperiencia(id);

        experiencia.setNomTra(nuevoNom);
        experiencia.setFechaIni(nuevoFI);
        experiencia.setFechaFin(nuevoFF);
        experiencia.setDescripcion(nuevaDescripcion);
        iexperienciaService.saveExperiencia(experiencia);
        return  experiencia;
    }


}
