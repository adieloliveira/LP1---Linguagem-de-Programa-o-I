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
public class TP01_Ex15 {
        public static void main(String[] args) {
            
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double dolar;
            double dolar2;
            double real;

            System.out.println("Digite a cotacao do dólar: ");
            dolar = read.nextDouble();
            
            System.out.println("Digite o valor em dolares para conversao: ");
            dolar2 = read.nextDouble();
            
           real = dolar2*dolar;

            System.out.printf("Em reais, apos a conversao: " + decimal.format(real));
    }
    
}