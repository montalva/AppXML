
package appxml;
//888




public class Verificador {
    private Pila p;
    String valor;
    public Verificador(){
        p = new Pila();
    }
    public boolean verificaXML(String url){
        
        Labeler a = new Archivo();
        String datos[] = a.leer(url);
        for (int i = 0; i < a.regresaI(); i++) {
            //System.out.println(datos[i]);
            if (p.push(datos[i])) {
                System.out.println("push " + i + datos[i]);
            } else {
                System.out.println(i + " dato no ingresado");
            }
        }
       for (int i = 0; i < a.regresaI(); i++) {
            System.out.println("pop " + i + " " + p.pop());
       }
        return false;
        
        
    }
}
