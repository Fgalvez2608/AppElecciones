
package Clases;

/**
 *
 * @author usuario
 */
public class ClsVotante extends ClsPersona {
    
    private String ciudadResidencia;

    public ClsVotante(String ciudadResidencia, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    
    
}
