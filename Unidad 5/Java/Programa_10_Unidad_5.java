/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_10_unidad_5;
import java.util.Random;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_10_Unidad_5 {

    public static void main(String[] args) {
        int longitud = 8;
        String contrasena = aleatorio(longitud);
        System.out.println("Password: " + contrasena);
    }
    public static String aleatorio(int longitud)
            //Declarar caracteres
    {
    String caracteres = "ABCDEFghijkl0123456789*-_.";
        Random random = new Random ();
    StringBuilder cadena = new StringBuilder (longitud);
    
    for (int i = 0; i < longitud; i++)
    {
        int indiceCaracteres = random.nextInt (caracteres.length());
        cadena.append (caracteres.charAt(indiceCaracteres));
    }
        return cadena.toString();
    }
}



