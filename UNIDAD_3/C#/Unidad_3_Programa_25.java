/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_25;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_25 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        char operador;
        do {
            System.out.println("Ingrese un 'q' para salir:");
            operador = sc.next().charAt(0);

            if (operador != 'q') {
                System.out.println("Ingrese el primer número:");
                double num1 = sc.nextDouble();

                System.out.println("Ingrese el segundo número:");
                double num2 = sc.nextDouble();

                double resultado = 0;
                    switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido. Inténtelo de nuevo.");
                        continue;
                }

                System.out.println("El resultado es: " + resultado);
            }

        } while (operador != 'q');
        
    }
        }