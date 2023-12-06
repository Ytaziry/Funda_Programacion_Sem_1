/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_18_uni_4;

/**
 *
 * @author USUARIO LENOVO
 */
public class Prog_18_Uni_4 {

    public static void main(String[] args) {
         int diag[][] = { {1,2,3} , {4,5,6} , {7,8,9} };
            System.out.println("Diagonal principal: ");
            for (int c=0; c<diag.length; c++) {
                System.out.println(diag[c][c]+" ");
            }
            System.out.println("Diagonal inversa:  ");
            for(int i=0; i<3; i++) {
               System.out.println(diag[i][diag.length -1 -i]); 
               {
            }
            }
             System.out.println("Diagonal secundaria:  ");
            for(int i=0; i<2; i++)
               System.out.println(diag[i][i+1]+" "); 
    }
}
