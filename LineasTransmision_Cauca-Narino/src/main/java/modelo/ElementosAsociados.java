
package modelo;

public class ElementosAsociados {
    
    private String segmentoDeBarras;
    private String bahias;
    private String lineas;
    private String transformadores;
    private String reactores;
    private String condensadores;
    private String SVC_STATCOM_FACT;
    private String asociadoSupervision;
    
    public ElementosAsociados(String segmentoDeBarras, String bahias, String lineas, String transformadores, String reactores, String condensadores, String SVC_STATCOM_FACT, String asociadoSupervision){
        this.segmentoDeBarras=segmentoDeBarras;
        this.bahias=bahias;
        this.lineas=lineas;
        this.transformadores=transformadores;
        this.reactores=reactores;
        this.condensadores=condensadores;
        this.SVC_STATCOM_FACT=SVC_STATCOM_FACT;
        this.asociadoSupervision=asociadoSupervision;
    }
    
    //getters
    public String getSegmentoDeBarras(){ return segmentoDeBarras; }
    public String getBahias(){ return bahias; }
    public String getLineas(){ return lineas; }
    public String getTransformadores(){ return transformadores; }
    public String getReactores(){ return reactores; }
    public String getCondensadores(){ return condensadores; }
    public String getSVC_STATCOM_FACT(){ return SVC_STATCOM_FACT; }
    public String getAsociadoSupersvision(){ return asociadoSupervision; }
    
    //setters
    public void setSegmentoDeBarras(String segmentoDeBarras){ this.segmentoDeBarras=segmentoDeBarras; }
    public void setBahias(String bahias){ this.bahias=bahias; }
    public void setLineas(String lineas){ this.lineas=lineas; }
    public void setTransformadores(String transformadores){ this.transformadores=transformadores; }
    public void setReactores(String reactores){ this.reactores=reactores; }
    public void setCondensadores(String condensadores){ this.condensadores=condensadores; }
    public void setSVC_STATCOM_FACT(String SVC_STATCOM_FACT){ this.SVC_STATCOM_FACT=SVC_STATCOM_FACT; }
    public void setAsociadoSupervision(String asociadoSupervision){ this.asociadoSupervision=asociadoSupervision; }
}
