/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_3_uni_4;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Prog_3_Uni_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de temperaturas que se van a procesar: ");
        int totalT = Integer.parseInt(sc.nextLine());

        double[] tCelsius = new double[totalT];
        double[] tFahrenheit = new double[totalT];
        double[] tKelvin = new double[totalT];

        for (int c = 0; c < totalT; c++) {
            System.out.print("Ingrese la temperatura en °C " + (c + 1) + ": ");
            tCelsius[c] = Double.parseDouble(sc.nextLine());

            tFahrenheit[c] = (tCelsius[c] * 9 / 5) + 32;
            tKelvin[c] = tCelsius[c] + 273.15;
        }

        System.out.println("Resultados:");
        for (int c = 0; c < totalT; c++) {
            System.out.printf("Temperatura %d - %.2f°C = %.2f°F = %.2f°K%n", (c + 1), tCelsius[c], tFahrenheit[c], tKelvin[c]);
        }

        sc.close();
    }
}
