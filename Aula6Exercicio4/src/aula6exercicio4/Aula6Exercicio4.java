/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio4;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int numero;
            
                System.out.println("Digite um número: ");
                numero = scan.nextInt();
                
                    if (numero >= 0) {
                        System.out.println("É maior ou igual a 0");
                    }
                    
                    if (numero < 0){
                        System.out.println("É menor que 0");
                    }
    }
    
}
