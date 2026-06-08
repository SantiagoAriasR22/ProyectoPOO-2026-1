
package modelo;

import java.util.ArrayList;

public class Subestacion {
    
    private String id;
    private String nombre;
    private double voltajeNominalDeOperacion;
    private ArrayList<String> operadores;
    private Ubicacion ubicacion;
    private double latitud;
    private double longitud;
    private ElementosAsociados elementosAsociados;
    
    private Subestacion(Builder builder){
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.voltajeNominalDeOperacion = builder.voltajeNominalDeOperacion;
        this.operadores = builder.operadores;
        this.ubicacion = new Ubicacion(builder.departamento, builder.municipio, builder.subAreaDeOperacion);
        this.latitud = builder.latitud;
        this.longitud = builder.longitud;
        this.elementosAsociados = new ElementosAsociados(builder.segmentoDeBarras, builder.bahias, builder.lineas, builder.transformadores, builder.reactores, builder.condensadores, builder.SVC_STATCOM_FACT, builder.asociadoSupervision);
    }
    
    //getters
    public String getID(){ return id; }
    public String getNombre(){ return nombre; }
    public double getVoltajeNominal(){ return voltajeNominalDeOperacion; }
    public ArrayList getOperadores(){ return operadores; }
    public Ubicacion getUbicacion(){ return ubicacion; }
    public double getLatitud(){ return latitud; }
    public double getLongitud(){ return longitud; }
    
    //setters
    public void setID(String id){ this.id=id; }
    public void setNombre(String nombre){ this.nombre=nombre; }
    public void setVoltajeNominalDeOperacion(double voltajeNominalDeOperacion){ this.voltajeNominalDeOperacion=voltajeNominalDeOperacion; }
    //setters de operadores queda pendiente
    public void setLatitud(double latitud){ this.latitud=latitud; }
    public void setLongitud(double longitud){ this.longitud=longitud; }
    
    public static class Builder{
        
        private String id;
        private String nombre;
        private double voltajeNominalDeOperacion;
        private ArrayList<String> operadores= new ArrayList<>();
        private Ubicacion ubicacion;
        private double latitud;
        private double longitud;
        private String segmentoDeBarras;
        private String bahias;
        private String lineas;
        private String transformadores;
        private String reactores;
        private String condensadores;
        private String SVC_STATCOM_FACT;
        private String asociadoSupervision;
        private String departamento;
        private String municipio;
        private String subAreaDeOperacion;
        
        public Builder(){}
        
        public Builder id(String id){ this.id = id; return this; }
        public Builder nombre(String nombre){ this.nombre = nombre; return this; }
        public Builder voltajeNominalDeOperacion(double voltaje){ this.voltajeNominalDeOperacion = voltaje; return this; }
        public Builder operadores(ArrayList<String> operadores){ this.operadores = operadores; return this; }
        public Builder latitud(double latitud){ this.latitud = latitud; return this; }
        public Builder longitud(double longitud){ this.longitud = longitud; return this; }
        public Builder segmentoDeBarras(String segmentoDeBarras){ this.segmentoDeBarras = segmentoDeBarras; return this; }
        public Builder bahias(String bahias){ this.bahias = bahias; return this; }
        public Builder lineas(String lineas){ this.lineas = lineas; return this; }
        public Builder transformadores(String transformadores){ this.transformadores = transformadores; return this; }
        public Builder reactores(String reactores){ this.reactores = reactores; return this; }
        public Builder condensadores(String condensadores){ this.condensadores = condensadores; return this; }
        public Builder SVC_STATCOM_FACT(String SVC){ this.SVC_STATCOM_FACT = SVC; return this; }
        public Builder asociadoSupervision(String asociado){ this.asociadoSupervision = asociado; return this; }
        public Builder departamento(String departamento){ this.departamento=departamento; return this; }
        public Builder municipio(String municipio){ this.municipio=municipio; return this; }
        public Builder subAreaDeOperacion(String subAreaDeOperacion){ this.subAreaDeOperacion=subAreaDeOperacion; return this; }
        
        public Subestacion build(){
            return new Subestacion(this);
        }
    }
    
}
