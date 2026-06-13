package modelo;

import java.util.*;

public class SistemaElectrico {
    
    private static ArrayList<LineaTransmision> lineasActivas = new ArrayList<>();
    private static ArrayList<Subestacion> subestacionesActivas = new ArrayList<>();
    
    public static void main(String[] args) {
        
    }
    
    public LineaTransmision buscarLineaTransmision(String idLinea){
        //El stream es como una banda transportadora que agarra cada linea, una por una, y mediante el .filter evalua una condicion
        //evalua si el ID de la linea (que es una variable temporal de tipo LineaTransmision) es igual a idLinea que es el ID buscado, el equalsIgnoreCase compara dos cadenas pero ignora las mayusculas y minusculas
        //se ejecuta el .findFirst cuando se encuentra la primera coincidencia, se detiene el stream y se retorna el objeto. Si no se encuentra nada, retorna null
        return lineasActivas.stream().filter(linea->linea.getInformacionBasica().getID().equalsIgnoreCase(idLinea)).findFirst().orElse(null);
    }

    public ArrayList<LineaTransmision> getLineasActivas(){ return lineasActivas; }
    public ArrayList<Subestacion> getSubestacions(){ return subestacionesActivas; }
    public void eliminarLineaActiva(LineaTransmision lineaTransmision){ lineasActivas.remove(lineaTransmision); }
    public void eliminarSubestacionActiva(Subestacion subestacion){ subestacionesActivas.remove(subestacion); }
    public void agregarLineasActivas(LineaTransmision lineaTransmision){ lineasActivas.add(lineaTransmision); }
    public void agregarSubestacionesActivas(Subestacion subestacion){ subestacionesActivas.add(subestacion); }
    
    
}