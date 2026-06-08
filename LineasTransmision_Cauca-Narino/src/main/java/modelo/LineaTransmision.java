
package modelo;

import java.util.ArrayList;

public class LineaTransmision {
    
    private String id;
    private String nombre;
    private String estado;
    private String operador;
    private String FPO;
    private String tipoDeConexion;
    private ArrayList<String> subestacionesRelacionadas;
    private String tipoDeLinea;
    private String acuerdoDeConexionCompartida;
    private Ubicacion ubicacion;
    private Capacidad capacidad;
    private CapacidadPorTramo capacidadPorTramo;
    
    private LineaTransmision(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.estado = builder.estado;
        this.operador = builder.operador;
        this.FPO = builder.FPO;
        this.tipoDeConexion = builder.tipoDeConexion;
        this.subestacionesRelacionadas = builder.subestacionesRelacionadas;
        this.tipoDeLinea = builder.tipoDeLinea;
        this.acuerdoDeConexionCompartida = builder.acuerdoDeConexionCompartida;
        this.ubicacion = new Ubicacion(builder.departamento, builder.municipio, builder.subAreaOperativa);
        this.capacidad = new Capacidad(builder.voltajeNominal, builder.voltajeMaximo,builder.corrienteNominal, builder.corrienteEmergencia, builder.limiteTermico, builder.longitudTotal);
        this.capacidadPorTramo = new CapacidadPorTramo(builder.resistenciaR1, builder.reactanciaX1, builder.susceptanciaB1, builder.resistenciaR0, builder.reactanciaX0, builder.susceptanciaB0, builder.comparteEstructura,
        builder.circuitosCompartidos, builder.resistenciaMutuaR0m, builder.reactanciaMutuaX0m);
    }
    
    //getters
    public String getID(){ return id; }
    public String getNombre(){ return nombre; }
    public String getEstado(){ return estado; }
    public String getOperador(){ return operador; }
    public String getFPO(){ return FPO; }
    public String getTipoConexion(){ return tipoDeConexion; }
    public ArrayList getSubestacionesRelacionadas(){ return subestacionesRelacionadas; }
    public String getTipoDeLinea(){ return tipoDeLinea; }
    public String getAcuerdoDeConexionCompartida(){ return acuerdoDeConexionCompartida; }
    public Ubicacion getUbicacion(){ return ubicacion; }
    public Capacidad getCapacidad(){ return capacidad; }
    public CapacidadPorTramo getCapacidadPorTramo(){ return capacidadPorTramo; }
    
    //setters
    public void setID(String id){ this.id=id; }
    public void setNombre(String nombre){ this.nombre=nombre; }
    public void setEstado(String estado){ this.estado=estado; }
    public void setOperador(String operador){ this.operador=operador; }
    public void setFPO(String FPO){ this.FPO=FPO; }
    public void setTipoConexion(String tipoConexion){ this.tipoDeConexion=tipoConexion; }
    //setters de subestaciones relacionadas pendiente
    public void setTipoDeLinea(String tipoDeLinea){ this.tipoDeLinea=tipoDeLinea; }
    public void setAcuerdoDeConexionCompartida(String acuerdoDeConexionCompartida){ this.acuerdoDeConexionCompartida=acuerdoDeConexionCompartida; }
    
    public static class Builder{
        
        private String id;
        private String nombre;
        private String estado;
        private String operador;
        private String FPO;
        private String tipoDeConexion;
        private ArrayList<String> subestacionesRelacionadas = new ArrayList<>();
        private String tipoDeLinea;
        private String acuerdoDeConexionCompartida;
        private double voltajeNominal;
        private double voltajeMaximo;
        private double corrienteNominal;
        private double corrienteEmergencia;
        private double limiteTermico;
        private double longitudTotal;
        private double resistenciaR1;
        private double reactanciaX1;
        private double susceptanciaB1;
        private double resistenciaR0;
        private double reactanciaX0;
        private double susceptanciaB0;
        private String comparteEstructura;
        private ArrayList<String> circuitosCompartidos= new ArrayList<>();
        private double resistenciaMutuaR0m;
        private double reactanciaMutuaX0m;
        private String departamento;
        private String municipio;
        private String subAreaOperativa;
        
        public Builder(){}
        
        public Builder id(String id){ this.id=id; return this; }
        public Builder nombre(String nombre){ this.nombre=nombre; return this; }
        public Builder estado(String estado){ this.estado=estado; return this; }
        public Builder operador(String operador){ this.operador=operador; return this; }
        public Builder FPO(String FPO){ this.FPO=FPO; return this; }
        public Builder tipoDeConexion(String tipoDeConexion){ this.tipoDeConexion=tipoDeConexion; return this; }
        public Builder subestacionesRelacionadas(ArrayList<String> subestacionesRelacionadas){ this.subestacionesRelacionadas=subestacionesRelacionadas; return this; }
        public Builder tipoDeLinea(String tipoDeLinea){ this.tipoDeLinea=tipoDeLinea; return this; }
        public Builder acuerdoDeConexionCompartida(String acuerdoDeConexionCompartida){ this.acuerdoDeConexionCompartida=acuerdoDeConexionCompartida; return this; }
        public Builder voltajeNominal(double voltajeNominal){ this.voltajeNominal=voltajeNominal; return this; }
        public Builder voltajeMaximo(double voltajeMaximo){ this.voltajeMaximo=voltajeMaximo; return this; }
        public Builder corrienteNominal(double corrienteNominal){ this.corrienteNominal=corrienteNominal; return this; }
        public Builder corrienteEmergencia(double corrienteEmergencia){ this.corrienteEmergencia=corrienteEmergencia; return this; }
        public Builder limiteTermico(double limiteTermico){ this.limiteTermico=limiteTermico; return this; }
        public Builder longitudTotal(double longitudTotal){ this.longitudTotal=longitudTotal; return this; }
        public Builder resistenciaR1(double resistenciaR1){ this.resistenciaR1=resistenciaR1; return this; }
        public Builder reactanciaX1(double reactanciaX1){ this.reactanciaX1=reactanciaX1; return this; }
        public Builder susceptanciaB1(double susceptanciaB1){ this.susceptanciaB1=susceptanciaB1; return this; }
        public Builder resistenciaR0(double resistenciaR0){ this.resistenciaR0=resistenciaR0; return this; }
        public Builder reactanciaX0(double reactanciaX0){ this.reactanciaX0=reactanciaX0; return this; }
        public Builder susceptanciaB0(double susceptanciaB0){ this.susceptanciaB0=susceptanciaB0; return this; }
        public Builder comparteEstructura(String comparteEstructura){ this.comparteEstructura=comparteEstructura; return this; }
        public Builder circuitosCompartidos(ArrayList<String> circuitosCompartidos){ this.circuitosCompartidos=circuitosCompartidos; return this; }
        public Builder resistenciaMutuaR0m(double resistenciaMutuaR0m){ this.resistenciaMutuaR0m=resistenciaMutuaR0m; return this; }
        public Builder reactanciaMutuaX0m(double reactanciaMutuaX0m){ this.reactanciaMutuaX0m=reactanciaMutuaX0m; return this; }
        public Builder departamento(String departamento){ this.departamento=departamento; return this; }
        public Builder municipio(String municipio){ this.municipio=municipio; return this; }
        public Builder subAreaOperativa(String subAreaOperativa){ this.subAreaOperativa=subAreaOperativa; return this; }
        
        public LineaTransmision build(){
            return new LineaTransmision(this);
        }
        
    }
}
