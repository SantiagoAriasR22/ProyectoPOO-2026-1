
package modelo;

import java.util.ArrayList;

public class LineaTransmision {
    
    private InformacionBasica informacionBasica;
    private Ubicacion ubicacion;
    private Capacidad capacidad;
    private CapacidadPorTramo capacidadPorTramo;
    
    public LineaTransmision(InformacionBasica informacionBasica, Ubicacion ubicacion, Capacidad capacidad, CapacidadPorTramo capacidadPorTramo){
        this.informacionBasica=informacionBasica;
        this.ubicacion=ubicacion;
        this.capacidad=capacidad;
        this.capacidadPorTramo=capacidadPorTramo;
    }
    
    //getters
    public InformacionBasica getInformacionBasica(){ return informacionBasica; }
    public Ubicacion getUbicacion(){ return ubicacion; }
    public Capacidad getCapacidad(){ return capacidad; }
    public CapacidadPorTramo getCapacidadPorTramo(){ return capacidadPorTramo; }
    
}
