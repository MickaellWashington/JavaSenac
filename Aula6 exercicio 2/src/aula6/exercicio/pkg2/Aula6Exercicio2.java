/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int qtdMinima;
            int qtdMaxima;
            int media;
            
                System.out.println("Qual a quantidade mínima de peças? ");
                qtdMinima = scan.nextInt();
                
                System.out.println("Qual a quantidade máxima de peças? ");
                qtdMaxima = scan.nextInt();
                
                    media = (qtdMinima + qtdMaxima)/2;
                    
                        System.out.println("A média de peças é de: " + media);
        
    }
    
}
