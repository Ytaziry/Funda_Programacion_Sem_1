/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_1_unidad_5;

/**
 *
 * @author USUARIO LENOVO
 */
public class Programa_1_Unidad_5 {

    public static void main(String[] args) 
    {
        System.out.println("Suma = " + suma (7,8));
        System.out.println("Resta = " + resta (32,12));
        System.out.println("Multiplicacion = " + multiplicacion (23,15));
        System.out.println("Division = " + division(90,5));
    }
    public static int suma (int a, int b)
    {
        int r = a + b;
        return r;
    }
    public static int resta (int a, int b)
    {
       int r = a - b; 
       return r;
    }
    public static int multiplicacion (int a, int b)
    {
        int r = a * b;
        return r;
    }
    public static int division (int a, int b)
    {
        int r = a / b;
        return r;
    }
}
