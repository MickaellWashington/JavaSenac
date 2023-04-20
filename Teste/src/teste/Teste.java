/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author alunosenac
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double centimetros, valorCentimetros, cores, numeroCores;
        
        
        
            System.out.println("Digite o tamanho em centimetros: ");
            centimetros = scan.nextDouble();
            
            System.out.println("Digite o número de cores: ");
            cores = scan.nextDouble();
            
            if (centimetros == 1){
                valorCentimetros = 3.5;
            } else {
                valorCentimetros = centimetros * 3.5;
            }
            
            if (cores == 1) {
                numeroCores = 5.0;
            } else {
                numeroCores = cores * 5.0;
            
            System.out.println(valorCentimetros + numeroCores);
        
    }
    }  
}
