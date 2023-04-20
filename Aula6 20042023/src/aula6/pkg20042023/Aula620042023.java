/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.pkg20042023;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula620042023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int ferraduras = 4;
            int cavalos;
            int cavalosFerraduras;
            
                System.out.println("Quantos cavalos: ");
                cavalos = scan.nextInt();
                
                cavalosFerraduras = ferraduras * cavalos;
                
                    System.out.println("O número de ferraduras será de: "+ cavalosFerraduras + " para " + cavalos);
    }
    
}
