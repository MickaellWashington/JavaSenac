package aula5.part3;

import java.util.Scanner;

public class Aula5Part3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            int sexo;
            double altura, imc;
            
                System.out.println("Sexo Feminino digite 1, Masculino digite 2: ");
                sexo = scan.nextInt();
                
                System.out.println("Altura: ");
                altura = scan.nextDouble();
                
                    if (sexo == 2) {
                        imc = (72.7 * altura) - 58;
                            System.out.println(imc);
                    } else {
                        imc = (62.1 * altura) - 44.7;
                            System.out.println(imc);
                    }
            
        
        
        
    }
    
}
