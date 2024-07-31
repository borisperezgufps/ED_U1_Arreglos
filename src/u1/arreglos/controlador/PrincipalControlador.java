/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.arreglos.controlador;

import u1.arreglos.modelo.Negocio;
import u1.arreglos.vista.PrincipalVista;

/**
 *
 * @author Boris Perez
 */
public class PrincipalControlador {
    
    private Negocio negocio;
    private PrincipalVista frame;
    
    public PrincipalControlador(PrincipalVista frame){
        negocio = new Negocio();
        this.frame = frame;
    }
    
    public void crearArreglo(){
        String sTamanio = frame.getTxtTamanioArreglo().getText();
        int tamanio = Integer.parseInt(sTamanio);
        negocio.crearPosicionesArreglo(tamanio);
        
        actualizarPosicionesArreglos();
        
    }
    
    public void agregarElementoArreglo(){
        String valor = frame.getTxtValorArreglo().getText();
        negocio.agregarValor(valor);
        frame.getTxtValorArreglo().setText("");
        
        actualizarPosicionesArreglos();
    }
    
    private void actualizarPosicionesArreglos(){
        String textoPosiciones = negocio.obtenerPosicionesArreglo();
        String textoValores = negocio.obtenerValoresArreglo();
        
        frame.getTxtPosicionesArreglo().setText(textoPosiciones);
        frame.getTxtValoresArreglo().setText(textoValores);
    }

    public void crearArregloObjeto() {
        String sTamanio = frame.getTxtTamanioArregloObjeto().getText();
        int tamanio = Integer.parseInt(sTamanio);
        negocio.crearPosicionesArregloObjeto(tamanio);
        
        actualizarPosicionesArreglosObjetos();
    }
    
    private void actualizarPosicionesArreglosObjetos(){
        String textoPosiciones = negocio.obtenerPosicionesArregloObjetos();
        String textoValores = negocio.obtenerValoresArregloObjetos();
        
        frame.getTxtPosicionesArregloObjeto().setText(textoPosiciones);
        frame.getTxtValoresArregloObjeto().setText(textoValores);
    }
    
}
