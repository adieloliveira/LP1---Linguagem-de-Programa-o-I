import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adiel
 */
public class TP2_04 {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            double val[][] = new double[2][3];
          
            for(int i=0;i<2;i++)
            {
                for(int z=0;z<3;z++)
                {
                    System.out.println("Digite o valor para ser armazenado: ");
                    val[i][z] = read.nextDouble();
                }
            }
            
            System.out.println("Valores: ");

            for(int i=0;i<2;i++)
            {
                for(int z=0;z<3;z++)
                {
                    System.out.printf(val[i][z] + " | ");
                }
                System.out.println();
            }
    }    
}