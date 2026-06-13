
package modelo;

import java.util.ArrayList;

public class LineaTransmision {
    
    private String id;
    private String nombre;
    private String operador;
    private String estado;
    private String fechaOperacion;
    private String tipoOperacion;
    private String subEstacionesRelacionadas;
    private String tipoLinea;
    private String acuerdoConexionCompartida;
    private int voltajeNominal;
    private int voltajeMaximo;
    private double corrienteNominal;
    private double limiteEmergencia;
    private double limiteTermico;
    private double longitudTotal;
    private Ubicacion ubicacion;
    private double latitud;
    private double longitud;
    
    public LineaTransmision(String id, String nombre, String operador, String estado, String fechaOperacion, String tipoOperacion, String subEstacionesRelacionadas, String tipoLinea, String acuerdoConexionCompartida, int voltajeNominal, int voltajeMaximo, double corrienteNominal, double limiteEmergencia, double limiteTermico, double longitudTotal, Ubicacion ubicacion, double latitud, double longitud){
        this.id=id;
        this.nombre=nombre;
        this.operador=operador;
        this.estado=estado;
        this.fechaOperacion=fechaOperacion;
        this.tipoOperacion=tipoOperacion;
        this.subEstacionesRelacionadas=subEstacionesRelacionadas;
        this.tipoLinea=tipoLinea;
        this.acuerdoConexionCompartida=acuerdoConexionCompartida;
        this.voltajeNominal=voltajeNominal;
        this.voltajeMaximo=voltajeMaximo;
        this.corrienteNominal=corrienteNominal;
        this.limiteEmergencia=limiteEmergencia;
        this.limiteTermico=limiteTermico;
        this.longitudTotal=longitudTotal;
        this.ubicacion=ubicacion;
        this.latitud=latitud;
        this.longitud=longitud;

    }
    
    //getters
        public Ubicacion getUbicacion(){ return ubicacion; }
   
}
