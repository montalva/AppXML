
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
    private String [][] linea;

    String aux;
    public String[][] leer(String url){
        linea = new String[100][100];
     
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
            linea[i]= splitXML(aux);
            for (int j = 0; j < linea[i].length; j++) {
                System.out.println("" + j + " : " + linea[i][j]);   
            }  
            i++;
             
        }
        return linea;       
    }
    
    public int regresaI(){
        // regresa el indice total
        return i;
    }
    
    public static String[] splitXML(String str) {
        String[] vec = new String[100];
        int j = 0, i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '<') {
                i++;
                vec[j] = "";
                while (str.charAt(i) != '>') {
                    vec[j] += str.charAt(i);
                    i++;
                }
                j++;
            } else {
                i++;
            }
        }
        String[] r = new String[j];
        for (int k = 0;
                k < j;
                k++) {
            r[k] = vec[k];
        }
        return r;
    }
}
