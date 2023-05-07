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
public class Vientiochoseptiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sesion sesiones[]=new Sesion[5];
         
        for(int i=1;i<=sesiones.length;i++)
        {
            sesiones[i-1]=new Sesion("Sesion"+i,i);
            System.out.println(i+")"+sesiones[i-1].getAbiertos());
        }
        System.out.println("");
        sesiones[2].setAbiertos(5);
        
        for(int i=1;i<=sesiones.length;i++)
        {
            System.out.println(i+")"+sesiones[i-1].getAbiertos());
        }
        // TODO code application logic here
    }
    
}
