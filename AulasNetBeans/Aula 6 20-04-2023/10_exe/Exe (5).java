/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio7;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String vendedor;
        int codigoPeca;
        double precoUnit;
        int qtdVendida;
        double comissao;
        
            System.out.println("Nome do vendedor: ");
            vendedor = scan.nextLine();
            
            System.out.println("Código da peça: ");
            codigoPeca = scan.nextInt();
            
            System.out.println("Preço unitário da peça: ");
            precoUnit = scan.nextDouble();
            
            System.out.println("Qual a quantidade vendida? ");
            qtdVendida = scan.nextInt();
            
            comissao = ((precoUnit * qtdVendida) * 5)/100;
            
                System.out.println("O vendedor " + vendedor + " vendeu " + qtdVendida + " peças com o código de " + codigoPeca + " no valor unitário de " + precoUnit + " e teve uma comissão de R$" + comissao + ".");
        
    }
    
}
