package modelo;

import java.io.*;
import java.util.*;




public class SistemaElectrico {
    private static int contIdentifier=0;
    private static ArrayList<LineaTransmision> lineasActivas;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    void begin() {

        File in = new File("data\\dataLineas.csv");

        try {
        BufferedReader br = new BufferedReader(new FileReader(in));
            String s;

            while ((s = br.readLine()) != null) {

                String token[] = s.split(";");
//aqui va la lectura del split
                Ubicacion ubication = new Ubicacion(token[14], token[15], token[16]);
                LineaTransmision line= new LineaTransmision("Line"+contIdentifier, token[0], token[1], token[2], token[3],token[4],token[5],token[6],token[7],Integer.parseInt(token[8]),Integer.parseInt(token[9]),Double.parseDouble(token[10]),Double.parseDouble(token[11]), Double.parseDouble(token[12]), Double.parseDouble(token[13]), ubication, 1, 2);
                lineasActivas.add(line);
                
            }
                
        }
        catch(Exception e){
        System.out.println("Error: " + e);
        }
    }
    
}