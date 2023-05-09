/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio9;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double volume= 3.14159;
        double raio;
        double altura;
        double resultado;
                    
        System.out.println("Digite o valor do raio: ");
        raio = scan.nextDouble();
        
        System.out.println("Digite o valor da altura: ");
        altura = scan.nextDouble();
        
        resultado = volume * raio * raio * altura;
        
            System.out.println("O valor do volume é de: " + resultado);
    }
    
}
