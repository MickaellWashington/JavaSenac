package aula4exerciciosaritmeticos;

import java.util.Scanner;

public class Aula4exerciciosAritmeticos {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        
        String nomeVendedor;
        double salarioFixo;
        double totalVendas;
        double comissao;
        double valorTotal;
        
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = scan.nextLine();
        
        System.out.println("Digite o salário fixo do vendedor: ");
        salarioFixo = scan.nextDouble();
        
        System.out.println("Informe o total de vendas do vendedor: ");
        totalVendas = scan.nextDouble();
        
        comissao = (totalVendas * 10) / 15;
        valorTotal = salarioFixo + comissao;
        
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário: " + salarioFixo);
        System.out.println("Total de vendas: " + totalVendas);
        System.out.println("Comissão: " + comissao);
        System.out.println("Total a receber: " + valorTotal);
        
        
    }
    
}
