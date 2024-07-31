/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.arreglos.modelo;

/**
 *
 * @author Boris Perez
 */
public class Negocio {
    
    public String[] arreglo;
    
    public void crearPosicionesArreglo(int tamanio){
        arreglo = new String[tamanio];
    }
    
    public String obtenerPosicionesArreglo(){
        String texto = "";
        for(int i=0;i<arreglo.length;i++){
            texto += "[ "+i+" ] - ";
        }
        
        // Esto se hace para eliminar la rayita luego 
        // de la ultima posicion.
        texto = texto.substring(0, texto.length()-2);
        
        return texto;
    }
    
    public String obtenerValoresArreglo(){
        String texto = "";
        for(int i=0;i<arreglo.length;i++){
            String s = arreglo[i];
            if(s!=null && !s.isBlank())
                texto += "[ "+s+" ] - ";
            else
                texto += "[  ] - ";
        }
        texto = texto.substring(0, texto.length()-2);
        
        return texto;
    }
    
    public void agregarValor(String valor){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==null){
                arreglo[i] = valor;
                return;
            }
        }
        
        // Si no se encuentran posiciones vacias, no se agrega
        // el elemento.
    }
    
}
