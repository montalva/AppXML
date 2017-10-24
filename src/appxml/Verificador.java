
package appxml;
//888

public class Verificador {
    private Pila p;
    String valor;
    boolean correcta=false;
  
    public Verificador(){
        p = new Pila();
    }

    public boolean verificaXML(String url) {

        Labeler a = new Archivo();
        String datos[] = a.leer(url);
        //ingresar datos
        for (int i = 0; i < a.regresaI(); i++) {
            if (p.push(datos[i])) {
                System.out.println("push linea " + i + datos[i]);
            } else {
                System.out.println(i + " dato no ingresado");
            }
        }
        //recorrer vector de string
        for (int i = 0; i < a.regresaI(); i++) {
            valor = p.pop();
            //recorremos por caracter buscando el cierre de '<'
            for(int j = 0 ; j<valor.length();j++){
                if (valor.charAt(j)=='<'){
                    // si se encontro '<' pero es el último caracter, faltará '>'
                    if(j==valor.length()-1){
                        System.out.println("Secuencia incorrecta termino línea "+i+" se esperaba '>'");
                        break;
                    }
                    //recorremos por caracter buscando el cierre de '>'
                    for(int k=j+1;k<valor.length();k++){
                        if (valor.charAt(k)=='>'){  
                            System.out.println("Secuencia correcta linea " +i);
                            j=k;
                            break;                    
                        } else {
                            System.out.println("Secuencia incorrecta termino línea "+i);
                            j=k;
                        }               
                    }
                } else {
                    System.out.println("Secuencia incorrecta línea "+i+" se esperaba un '<'");
                }
            } 
           
        }
        return false;

    }
}
