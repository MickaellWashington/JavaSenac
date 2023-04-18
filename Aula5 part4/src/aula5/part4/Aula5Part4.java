package aula5.part4;

import java.util.Scanner;

public class Aula5Part4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int numero, resto;
            
                System.out.println("Digite um número: ");
                numero = scan.nextInt();
                
                    resto = numero % 2;
                
                        if (resto == 1){
                            System.out.println("Número é ímpar.");
                        } else {
                            System.out.println("Número é par.");
                        }

    }
    
}
