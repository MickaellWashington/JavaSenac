package aula6exercicios;

import java.util.Scanner;

public class Aula6exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String funcionario;
        double salario, aumento, salarioFinal;
        
            System.out.println("Nome funcionário: ");
            funcionario = scan.nextLine();
            
            System.out.println("Salário: ");
            salario = scan.nextDouble();
            
                if (salario <= 2500){
                    aumento = (salario*20)/100;
                    salarioFinal = salario + aumento;
                } else {
                    aumento = (salario*15)/100;
                    salarioFinal = salario + aumento;
                }
                
                    System.out.println(funcionario + " , seu salário anterior era de R$" + salario +
                             " , você teve um aumento de R$" + aumento +
                             "fazendo com que seu novo salário seja de R$" + salarioFinal);
    }
}
