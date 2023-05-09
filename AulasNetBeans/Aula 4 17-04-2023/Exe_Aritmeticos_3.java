package aula4part3exerciciosaritmeticos;
import java.util.Scanner;
public class Aula4part3exerciciosAritmeticos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
            String modelo;
            String cor;
            int ano;
            double custoFabrica;
            double distribuidor;
            double impostos;
            double resultado;

                System.out.print("Informe o modelo: ");
                modelo = scan.nextLine();
                
                System.out.print("Informe a cor do veículo: ");
                cor = scan.nextLine();

                System.out.print("Informe o ano: ");
                ano = scan.nextInt();

                System.out.print("Informe o valor: ");
                custoFabrica = scan.nextDouble();

                    impostos = (custoFabrica * 10)/45;
                    distribuidor = ((custoFabrica - impostos) * 10)/28;
                    resultado = custoFabrica + impostos + distribuidor;

                        System.out.print
                            ("O veículo " + modelo + " do ano de " +
                                ano + " na cor " + cor + " saíra na bagatela de "
                                + "R$" + resultado);
        }
    
}
