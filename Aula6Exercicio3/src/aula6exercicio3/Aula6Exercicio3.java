/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio3;

import java.util.Scanner;

/**
 *
 * @author M. Washington e Cauã Mendes
 */
public class Aula6Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int A;
        int B;
        
        System.out.println("Digite o valor de A: ");
        A = scan.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = scan.nextInt();
        
        if (A == A){
            System.out.println("O valor de A é " + B);
        } else {
            System.out.println("Digite o valor de A e B");
        }
        
        if (B == B){
            System.out.println("O valor de B é " + A);
        } else {
            System.out.println("Digite o valor de A e B");
        }
        
            
    }
    
}
