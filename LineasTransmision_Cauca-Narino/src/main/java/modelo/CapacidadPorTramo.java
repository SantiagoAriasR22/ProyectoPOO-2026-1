
package modelo;

import java.util.ArrayList;

public class CapacidadPorTramo {
    
    private double resistenciaR1;
    private double reactanciaX1;
    private double susceptanciaB1;
    private double resistenciaR0;
    private double reactanciaX0;
    private double susceptanciaB0;
    private String comparteEstructura;
    private ArrayList<String> circuitosCompartidos;
    private double resistenciaMutuaR0m;
    private double reactanciaMutuaX0m;
    
    public CapacidadPorTramo(double resistenciaR1, double reactanciaX1, double susceptanciaB1, double resistenciaR0, double reactanciaX0, double susceptanciaB0, String comparteEstructura, ArrayList circuitosCompartidos, double resistenciaMutuaR0m, double reactanciaMutuaX0m){
        this.resistenciaR1=resistenciaR1;
        this.reactanciaX1=reactanciaX1;
        this.susceptanciaB1=susceptanciaB1;
        this.resistenciaR0=resistenciaR0;
        this.reactanciaX0=reactanciaX0;
        this.susceptanciaB0=susceptanciaB0;
        this.comparteEstructura=comparteEstructura;
        this.circuitosCompartidos=circuitosCompartidos;
        this.resistenciaMutuaR0m=resistenciaMutuaR0m;
        this.reactanciaMutuaX0m=reactanciaMutuaX0m;
    }
    
    public CapacidadPorTramo(CapacidadPorTramo capacidadPorTramo){
        this.resistenciaR1=capacidadPorTramo.getResistenciaR1();
        this.reactanciaX1=capacidadPorTramo.getReactanciaX1();
        this.susceptanciaB1=capacidadPorTramo.getSusceptanciaB1();
        this.resistenciaR0=capacidadPorTramo.getResistenciaR0();
        this.reactanciaX0=capacidadPorTramo.getReactanciaX0();
        this.susceptanciaB0=capacidadPorTramo.getSusceptanciaB0();
        this.comparteEstructura=capacidadPorTramo.getComparteEstructura();
        this.circuitosCompartidos=capacidadPorTramo.getCircuitosCompartidos();
        this.resistenciaMutuaR0m=capacidadPorTramo.getResistenciaMutua();
        this.reactanciaMutuaX0m=capacidadPorTramo.getReactanciaMutua();
    }
    
    //getters
    public double getResistenciaR1(){ return resistenciaR1; }
    public double getReactanciaX1(){ return reactanciaX1; }
    public double getSusceptanciaB1(){ return susceptanciaB1; }
    public double getResistenciaR0(){ return resistenciaR0; }
    public double getReactanciaX0(){ return reactanciaX0; }
    public double getSusceptanciaB0(){ return susceptanciaB0; }
    public String getComparteEstructura(){ return comparteEstructura; }
    public ArrayList getCircuitosCompartidos(){ return circuitosCompartidos; }
    public double getResistenciaMutua(){ return resistenciaMutuaR0m; }
    public double getReactanciaMutua(){ return reactanciaMutuaX0m; }
    
    //setters
    public void setResistenciaR1(double resistenciaR1){ this.resistenciaR1=resistenciaR1; }
    public void setReactanciaX1(double reactanciaX1){ this.reactanciaX1=reactanciaX1; }
    public void setSusceptanciaB1(double susceptanciaB1){ this.susceptanciaB1=susceptanciaB1; }
    public void setResistenciaR0(double resistenciaR0){ this.resistenciaR0=resistenciaR0; }
    public void setReactanciaX0(double reactanciaX0){ this.reactanciaX0=reactanciaX0; }
    public void setSusceptanciaB0(double susceptanciaB0){ this.susceptanciaB0=susceptanciaB0; }
    public void setComparteEstructura(String comparteEstructura){ this.comparteEstructura=comparteEstructura; }
    //setters de circuito compartido pendientes
    public void setResistenciaMutua(double resistenciaMutuaR0m){ this.resistenciaMutuaR0m=resistenciaMutuaR0m; }
    public void setReactanciaMutua(double reactanciaMutuaX0m){ this.reactanciaMutuaX0m=reactanciaMutuaX0m; }
     
}
