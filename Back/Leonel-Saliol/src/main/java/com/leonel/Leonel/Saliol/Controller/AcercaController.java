package com.leonel.Leonel.Saliol.Controller;

import com.leonel.Leonel.Saliol.Entity.Acerca;
import com.leonel.Leonel.Saliol.Interface.IAcercaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AcercaController {

    @Autowired
    IAcercaService iacercaService;

    @GetMapping("/acerca/traer")
    public Acerca findAcerca(){
        return iacercaService.findAcerca((long)1);
    }
    @PostMapping ("/acerca/crear")
    public String createAcerca(@RequestBody Acerca acerca){
        iacercaService.saveAcercaDeMi(acerca);
        return "La descripcion fue creada correctamente";
    }

    @DeleteMapping ("/acerca/borrar/{id}")
    public String deleteAcerca(@PathVariable Long id){
        iacercaService.deleteAcerDeMi(id);
        return "La Descripcion fue eliminada correctamente";
    }

    @PutMapping ("/acerca/editar/{id}")
    public Acerca editAcerca(@PathVariable Long id,
                             @RequestParam("descripcion") String nuevaDescripcion){
        Acerca acerca = iacercaService.findAcerca(id);

        acerca.setDescripcion(nuevaDescripcion);

        iacercaService.saveAcercaDeMi(acerca);
        return acerca;

    }




}
