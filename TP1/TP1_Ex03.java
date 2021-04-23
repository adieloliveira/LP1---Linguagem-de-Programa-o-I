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
 * @author Adiek
 */
public class TP01_Ex03 {
    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double diagonal;
        double area;
        
        System.out.println("Digite o valor da diagonal do quadrado: ");
        diagonal = read.nextDouble();
        
        area = Math.pow(diagonal,2)/2;
        
        System.out.printf("A área do quadrado é: " + area);
    }
}