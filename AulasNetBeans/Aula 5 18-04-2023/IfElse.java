package aula5if.pkgelse.pkg18.pkg04.pkg2023;

import java.util.Scanner;

public class Aula5ifElse18042023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            double nota, nota1, nota2, media;
            
            System.out.println("Informe a primeira nota: ");
            nota = scan.nextDouble();
            System.out.println("Informe a segunda nota: ");
            nota1 = scan.nextDouble();
            System.out.println("Informe a teceira nota: ");
            nota2 = scan.nextDouble();
            
            media = (nota + nota1 + nota2) / 3;
            
                if (media >= 7.0){
                    System.out.println("APROVADO");
                } else {
                    System.out.println("REPROVADO");
                }
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
