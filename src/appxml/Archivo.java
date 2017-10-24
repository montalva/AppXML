
package appxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo implements Labeler  {
    String path;
    File file;
    private int i=0;
    private String [] linea;
    String aux;
    public String[] leer(String url){
        linea = new String[100];
        this.path = url;
        file = new File(this.path);
        Scanner entrada=null;
        try {
            entrada = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (entrada.hasNext()) {            
            aux = entrada.nextLine();
            linea[i]="";
            for (int j = 0; j < aux.length(); j++) {
                if (aux.charAt(j) == '<' || aux.charAt(j) == '>') {
                    linea[i] = linea[i]+String.valueOf(aux.charAt(j));   
                } 
                if(j==aux.length()-1 && !linea[i].isEmpty()){
                   i++;
                } else if(j==aux.length()-1 && linea[i].isEmpty()){
                   i--;
                }
            }
                         
        }
        return linea;
        
    }
    public int regresaI(){
        // regresa el indice total
        return i;
    }
}
