
package appxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo implements Labeler  {
    String path;
    File file;
    public int i=0;
    String [] linea;
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
            for (int j = 0; j < aux.length(); j++) {
                if (aux.charAt(j) == '<' || aux.charAt(j) == '>') {
                    linea[i] = String.valueOf(aux.charAt(j));
                    i++;
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
