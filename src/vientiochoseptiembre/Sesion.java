/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vientiochoseptiembre;

/**
 *
 * @author suare
 */
public class Sesion {
    private String nombre;
    private int numero;
    private static int abiertos;

    public Sesion(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        abiertos++;
    }

    public static void setAbiertos(int abiertos) {
        Sesion.abiertos = abiertos;
    }

    public static int getAbiertos() {
        return abiertos;
    }  
}
