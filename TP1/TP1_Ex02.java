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
public class TP01_Ex02 {
        public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double aresta;
        double area;
        
        System.out.println("Digite o valor da aresta do quadrado: ");
        aresta = read.nextDouble();
        
        area = Math.pow(aresta,2);
        
        System.out.printf("A área do quadrado é: " + area);
    }