package aula6part2;

import java.util.Scanner;

public class Aula6part2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            double usuarioLitros, gasolina = 5.90, desconto, valorFinal;
        
                System.out.println("Quantidade abastecida em litros: ");
                usuarioLitros = scan.nextDouble();
                
                    if (usuarioLitros <= 20){
                        desconto = (usuarioLitros * 3) /100;
                    } else {
                        desconto = (usuarioLitros * 5) /100;
                    }
                    
                        valorFinal = (gasolina - desconto) * usuarioLitros;
                        
                            System.out.println("O valor total foi de: " + valorFinal + " e o desconto foi de: " + desconto);
        
        
    }
    
}
