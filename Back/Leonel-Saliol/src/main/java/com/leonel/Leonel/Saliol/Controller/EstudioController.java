package com.leonel.Leonel.Saliol.Controller;

import com.leonel.Leonel.Saliol.Entity.Estudio;
import com.leonel.Leonel.Saliol.Entity.HarSk;
import com.leonel.Leonel.Saliol.Interface.IEstudioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/estudio")

public class EstudioController {

    @Autowired
    IEstudioServices iestudioServices;

    @GetMapping("/traer")
    public List<Estudio> getEstudio(){
        return iestudioServices.getEstudio();
    }

    @GetMapping("/traer/{id}")
    public Estudio findEstudio(@PathVariable Long id){
        return iestudioServices.findEstudio(id);
    }


    @PostMapping("/crear")
    public String createEstudio(@RequestBody Estudio estudio){
        iestudioServices.saveEstudio(estudio);
        return "El estudio se creo correctamente!";
    }

    @DeleteMapping ("/borrar/{id}")
    public String deleteEstudio(@PathVariable Long id){
        iestudioServices.deleteEstudio(id);
        return "El estudio se elimino correctamente!";
    }

    @PutMapping("/editar/{id}")
    public Estudio editEstudio(@PathVariable Long id,
                              @RequestParam("nomEst") String nuevoEst,
                              @RequestParam("year") String nuevoYear,
                              @RequestParam("descripcion") String nuevaDescripcion
                              ){
        Estudio estudio = iestudioServices.findEstudio(id);

        estudio.setNomEst(nuevoEst);
        estudio.setYear(nuevoYear);

        estudio.setDescripcion(nuevaDescripcion);

        iestudioServices.saveEstudio(estudio);

        return estudio;

    }


}
