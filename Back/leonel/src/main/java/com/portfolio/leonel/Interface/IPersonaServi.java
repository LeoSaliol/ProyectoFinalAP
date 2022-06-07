
package com.portfolio.leonel.Interface;

import com.portfolio.leonel.Entidad.Persona;
import java.util.List;


public interface IPersonaServi {
    // traer una lista de personas cuando yo llame al metodo get Personas
    public List<Persona> getPersona();
    
    // guardar un objeto de tipo persona :
    public void savePersona(Persona persona);
    
    //eliminar un objeto o usario, pero lo buscamos por id
    
    public void deletePersona(Long id);
    
    // Buscar una persona por id :
    
    public Persona findPersona(Long id);
}
