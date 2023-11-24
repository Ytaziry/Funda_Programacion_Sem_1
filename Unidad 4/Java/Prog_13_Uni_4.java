/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_13_uni_4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Prog_13_Uni_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float [][] temp = new float [5][7];
        for (int f=0; f<5; f++)
        {
            for (int c=0; c<7; c++)
            {
                System.out.println("Escribe temperatura en("+f+", "+c+")");
                temp [f][c]= sc.nextFloat();
            }
        }
        float [][] TempF =new float [5][7];
        for (int f=0; f<5; f++)
        {
            for (int c=0; c<7; c++)
            {
                TempF [f][c] = (temp[f][c]*9/5)+32;
                System.out.print("Grados Farenheit en ("+f+", "+c+")" + TempF[f][c] + ",");
            }
            System.out.println();
        }
    }
}


