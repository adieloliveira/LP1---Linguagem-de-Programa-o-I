/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade;
//Adiel Oliveira CB300726X
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adiel
 */
public class TP01_Ex17 {
        public static void main(String[] args) {
            
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double X;
            double Y;
            double pot;

            System.out.println("Para calcular a potencia, digite o valor da base: ");
            X = read.nextDouble();
            
            System.out.println("Agora digite o valor do expoente: ");
            Y = read.nextDouble();
            
            pot = Math.pow(X, Y);

            System.out.printf("Resultado: " + pot);
    } 
}
    
}