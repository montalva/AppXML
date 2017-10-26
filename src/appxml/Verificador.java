
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
        String datos[][] = a.leer(url);
        //ingresar datos
        for (int i = 0; i < a.regresaI(); i++) {
            for (int j = 0; j < datos[i].length; j++) {
               //  System.out.println("Linea "+ datos[i][j]);
                 if (datos[i][j].startsWith("/")){
                     System.out.println("encuentro fin: "+datos[i][j]);
                     String aux = p.pop();
                     System.out.println("quitar de la pila: "+aux);
                     if (datos[i][j].substring(1, datos[i][j].length()).equals(aux)){
                         System.out.println("linea xml correcta");
                     }
                     else{
                         System.out.println("linea xml incorrecta: " +aux+" != "+ datos[i][j].substring(1, datos[i][j].length()));
                     }
                 }else{
                     
                     p.push(datos[i][j]);
                     System.out.println("a la pila: "+datos[i][j]);
                 }
                 
            }

        }

        return false;

    }
}
