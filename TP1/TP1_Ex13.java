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
public class TP01_Ex13 {
        public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double velF;
        double velI;
        double acel;
        double tempo;
        
        System.out.println("Digite a velocidade inicial: ");
        velI = read.nextDouble();
        
        System.out.println("Digite a aceleação: ");
        acel = read.nextDouble();
        
        System.out.println("Digite o tempo de percurso: ");
        tempo = read.nextDouble();
       
        velF = velI + (acel*tempo);
        
        System.out.printf("A velocidade final é de: " + decimal.format(velF));
    }
}