package aula5if.pkgelse.part2;

import java.util.Scanner;

public class Aula5ifElsePart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            double nota, nota1, nota2, media;
            int faltas;
            
            
                System.out.println("Informe a primeira nota: ");
                nota = scan.nextDouble();
                
                System.out.println("Informe a segunda nota: ");
                nota1 = scan.nextDouble();
                
                System.out.println("Informe a terceira nota: ");
                nota2 = scan.nextDouble();
                
                System.out.println("Informe as faltas: ");
                faltas = scan.nextInt();
            
                    if (faltas > 5) {
                        media = ((nota + nota1 + nota2)/3)-1;
                            System.out.println(media);
                    } else {
                        media = (nota + nota1 + nota2) / 3;
                            System.out.println(media);
                    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
