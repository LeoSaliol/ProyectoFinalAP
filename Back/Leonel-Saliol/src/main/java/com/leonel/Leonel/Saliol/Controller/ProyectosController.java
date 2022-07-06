package com.leonel.Leonel.Saliol.Controller;

import com.leonel.Leonel.Saliol.Entity.Proyectos;
import com.leonel.Leonel.Saliol.Interface.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/proyectos")


public class ProyectosController {

    @Autowired
    IProyectosService iproyectosService;

    @GetMapping("/traer")
    public List<Proyectos> getProyectos(){
        return  iproyectosService.getProyectos();
    }

    @GetMapping("/traer/{id}")
    public Proyectos findProyecto(@PathVariable Long id){
        Proyectos proyecto = iproyectosService.findProyecto(id);
        return proyecto;
    }

    @PostMapping("/crear")
    public String crearProyecto(@RequestBody Proyectos proyecto){
        iproyectosService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        iproyectosService.deleteProyecto(id);
        return "El proyecto fue Eliminado";
    }

    @PutMapping("/editar/{id}")
    public Proyectos editProyecto(@PathVariable Long id,
                                  @RequestParam("title") String nuevoTitle,
                                  @RequestParam("year") String nuevoYear,
                                  @RequestParam("descripcion") String nuevaDescripcion,
                                  @RequestParam("link") String nuevoLink){
        Proyectos proyecto = iproyectosService.findProyecto(id);

        proyecto.setTitle(nuevoTitle);
        proyecto.setYear(nuevoYear);
        proyecto.setDescripcion(nuevaDescripcion);
        proyecto.setLink(nuevoLink);

        iproyectosService.saveProyecto(proyecto);
        return proyecto;


    }


}
