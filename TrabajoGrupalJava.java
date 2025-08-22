/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author ALUMNO#
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        
        double precioriginal = 70000.0;
        double descuento = 20.0;
                
        double montodescuento= (precioriginal * descuento) / 70000;
        double PrecioFinal= precioriginal * montodescuento;
            
        System.out.println("montodescuento = " + montodescuento);
        System.out.println("PrecioFinal = "+ PrecioFinal);
    }
}
