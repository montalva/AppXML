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
        aux = lista.get(contador-1);
        lista.remove(contador-1);
        contador--;
        return aux ;
    }
    public void push(int i, String str){
        lista.add(i,str);
       
    }
}
