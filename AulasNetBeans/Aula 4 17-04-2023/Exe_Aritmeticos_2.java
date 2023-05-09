package aula4part2exercicoaritmetico;

import java.util.Scanner;

public class Aula4part2exercicoAritmetico {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        double celsio;
        double fahrenheit;
        
        System.out.println("Digite a temperatura em Celsio: ");
        celsio = scan.nextDouble();
        
        fahrenheit = (9* celsio + 160)/5;
        
        System.out.println("A temperatura a ser convertida é de: " + celsio);
        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit);
        
        
    }
    
}
