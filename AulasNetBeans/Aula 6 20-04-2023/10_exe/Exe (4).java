/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio6;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double dolarCot;
        double valorDolar;
        double valorReal;
        
            System.out.println("Cotação do dólar: ");
            dolarCot = scan.nextDouble();
            
            System.out.println("Valor em dólares: ");
            valorDolar = scan.nextDouble();
            
            valorReal = dolarCot * valorDolar;
            
                System.out.println("O valor em real é de: R$" + valorReal);
        
        
    }
    
}
