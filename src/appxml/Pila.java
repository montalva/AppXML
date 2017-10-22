/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appxml;

import java.util.ArrayList;

/**
 *
 * @author usuario 2
 */
public class Pila {
    private ArrayList<String> lista;
    int contador=0;
    String aux;
    public Pila(){
        lista = new ArrayList<>();
    }
    public boolean push(String str){
        if(lista.add(str)){
            contador++;
            return true;
        } else
            return false;
    }
    public String pop(){
        contador--;
        aux = lista.get(contador);
        lista.set(contador, null);
        
        return aux ;
    }
}
