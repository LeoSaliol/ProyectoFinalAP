package com.leonel.Leonel.Saliol.Controller;

import com.leonel.Leonel.Saliol.Entity.Acerca;
import com.leonel.Leonel.Saliol.Interface.IAcercaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/acerca")


public class AcercaController {

    @Autowired
    IAcercaService iacercaService;

    @GetMapping("/traer/{id}")
    public Acerca findAcerca(@PathVariable Long id){
        return iacercaService.findAcerca(id);
    }
    @PostMapping ("/crear")
    public String createAcerca(@RequestBody Acerca acerca){
        iacercaService.saveAcercaDeMi(acerca);
        return "La descripcion fue creada correctamente";
    }

    @DeleteMapping ("/borrar/{id}")
    public String deleteAcerca(@PathVariable Long id){
        iacercaService.deleteAcerDeMi(id);
        return "La Descripcion fue eliminada correctamente";
    }

    @PutMapping ("/editar/{id}")
    public Acerca editAcerca(@PathVariable Long id,
                             @RequestParam("descripcion") String nuevaDescripcion){
        Acerca acerca = iacercaService.findAcerca(id);

        acerca.setDescripcion(nuevaDescripcion);

        iacercaService.saveAcercaDeMi(acerca);
        return acerca;

    }




}
