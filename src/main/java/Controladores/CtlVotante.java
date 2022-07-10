
package Controladores;

import Clases.ClsVotante;
import Modelos.MdlVotante;

/**
 *
 * @author usuario
 */
public class CtlVotante {
    
    MdlVotante modelo;
    
    public CtlVotante() {
        this.modelo = new MdlVotante();
    }
    
    public boolean agregarVotante(ClsVotante votante){
        
        return this.modelo.agregarVotante(votante);
    }
    
}
