/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio8;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int kmLitro;
            int tempo;
            int velocidadeMedia;
            int distancia;
            int litrosCombustivel;
            
                System.out.println("Quantos Km/L seu automóvel faz?");
                kmLitro = scan.nextInt();
                
                System.out.println("Quanto tempo gasta para completar a viagem em horas?");
                tempo = scan.nextInt();
                
                System.out.println("Qual a velocidade média do automóvel?");
                velocidadeMedia = scan.nextInt();
                
                System.out.println("Quantos litros de combustível foram utilizados?");
                litrosCombustivel = scan.nextInt();
                
                distancia = tempo * velocidadeMedia;
                litrosCombustivel = distancia / kmLitro;
                
                    System.out.println("A velocidade média foi de: " + velocidadeMedia + ""
                            + " km/h, o tempo gasto foi de: " + tempo + " horas, a distância foi de: " 
                    + distancia + " km, e a quantidade de litros de combustível usado foi de: " + litrosCombustivel + " litros.");
                
                
        
    }
    
}
