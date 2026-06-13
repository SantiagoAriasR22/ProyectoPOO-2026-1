
package modelo;

import java.util.ArrayList;

public class Subestacion {
    
    private String id;
    private String nombre;
    private ArrayList<Double> voltajeNominalDeOperacion;
    private ArrayList<String> operadores;
    private Ubicacion ubicacion;
    private double latitud;
    private double longitud;
    
    public Subestacion(String id, String nombre, ArrayList voltajeNominalDeOperacion, ArrayList operadores, Ubicacion ubicacion, double latitud, double longitud, ElementosAsociados elementosAsociados){
        this.id=id;
        this.nombre=nombre;
        this.voltajeNominalDeOperacion=voltajeNominalDeOperacion;
        this.operadores=operadores;
        this.ubicacion=ubicacion;
        this.latitud=latitud;
        this.longitud=longitud;
    }
    
   /* public Subestacion(Subestacion subestacion){
        this.id=subestacion.getID();
        this.nombre=subestacion.getNombre();
        this.voltajeNominalDeOperacion=subestacion.getVoltajeNominal();
        this.operadores=subestacion.getOperadores();
        this.ubicacion=subestacion.getUbicacion();
        this.latitud=subestacion.getLatitud();
        this.longitud=subestacion.getLongitud();
        this.elementosAsociados=subestacion.getElementosAsociados();
    }*/
    
    //getters
    public String getID(){ return id; }
    public String getNombre(){ return nombre; }
    public Ubicacion getUbicacion(){ return ubicacion; }
    public double getLatitud(){ return latitud; }
    public double getLongitud(){ return longitud; }
   
    
    //setters
    public void setID(String id){ this.id=id; }
    public void setNombre(String nombre){ this.nombre=nombre; }
    //setters de operadores y voltaje nominal queda pendiente
    public void setLatitud(double latitud){ this.latitud=latitud; }
    public void setLongitud(double longitud){ this.longitud=longitud; }
    
}
