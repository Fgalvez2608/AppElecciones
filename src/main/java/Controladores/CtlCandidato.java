
package Controladores;

import Clases.ClsCandidato;
import Modelos.MdlCandidato;

/**
 *
 * @author davidperezarias
 */
public class CtlCandidato {
    
    MdlCandidato modelo;

    public CtlCandidato() {
        this.modelo = new MdlCandidato();
    }
    
    public boolean agregarCandidato(ClsCandidato candidato){
        
        return this.modelo.agregarCandidato(candidato);
    }
    
    
}
