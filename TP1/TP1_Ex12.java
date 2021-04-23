  
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
public class TP01_Ex12 {
    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double raio;
        double altura;
        double volume;
        
        System.out.println("Digite o valor do raio da base do cone: ");
        raio = read.nextDouble();
        
        System.out.println("Digite o valor da altura do cone: ");
        altura = read.nextDouble();
       
        volume = (3.14*Math.pow(raio,2)*altura)/3;
        
        System.out.printf("O volume do cone é: " + decimal.format(volume) +"³");
    }
        
}