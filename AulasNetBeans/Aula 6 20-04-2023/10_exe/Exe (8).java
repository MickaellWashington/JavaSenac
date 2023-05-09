/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exercicio10;

import java.util.Scanner;

/**
 *
 * @author M. Washington
 */
public class Aula6Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double anos;
        double meses;
        double dias;
        
        System.out.println("anos: ");
        anos = scan.nextDouble();
        
        meses = anos * 12;
        dias = meses * 30;
        
        System.out.println(dias);
        
    }
    
}
