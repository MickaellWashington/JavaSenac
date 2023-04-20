/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio5;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            double n1, n2, diferenca;
            
                System.out.println("Digite o primeiro valor: ");
                n1 = scan.nextDouble();
                
                System.out.println("Digite o segundo valor: ");
                n2 = scan.nextDouble();
                
                    diferenca = n1 - n2;
                    
                        System.out.println("A diferença entre " + n1 + " e " + n2 + " e de " + diferenca);
    }
    
}
