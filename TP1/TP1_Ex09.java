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
public class TP01_Ex09 {
        public static void main(String[] args) {
        
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double resist;
            double corrente;
            double circuito;

            System.out.println("Digite o valor da resistência elétrica: ");
            resist = read.nextDouble();
 
            System.out.println("Digite o valor da corrente elétrica: ");
            corrente = read.nextDouble();

            circuito = resist*corrente;

            System.out.println("Valor de circuito elétrico: " + circuito + " V");
    }
}