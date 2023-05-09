package aula3part2exerciciosaritmeticos;

import java.util.Scanner;

public class Aula3part2EXERCICIOSARITMETICOS {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
        
        String name;
        String name1;
        String name2;
        
        String curso;
        String curso1;
        String curso2;
        
        double notaMensal;
        double notaMensal1;
        double notaMensal2;
        
        double notaBimestral;
        double notaBimestral1;
        double notaBimestral2;
        
        double notaSemestral;
        double notaSemestral1;
        double notaSemestral2;
        
        double media;
        double media1;
        double media2;
        
        System.out.print("Digite o nome do usuário 1: ");
        name = scan.nextLine();
        System.out.print("Digite o nome do usuário 2: ");
        name1 = scan.nextLine();
        System.out.print("Digite o nome do usuário 3: ");
        name2 = scan.nextLine();
        
        System.out.print("Digite o curso do usuário 1: ");
        curso = scan.nextLine();
        System.out.print("Digite o curso do usuário 2: ");
        curso1 = scan.nextLine();
        System.out.print("Digite o curso do usuário 3: ");
        curso2 = scan.nextLine();  
        
        System.out.print("Digite a nota mensal do usuário 1: ");
        notaMensal = scan.nextDouble();
        System.out.print("Digite a nota mensal do usuário 2: ");
        notaMensal1 = scan.nextDouble();
        System.out.print("Digite a nota mensal do usuário 3: ");
        notaMensal2 = scan.nextDouble();
        
        System.out.print("Digite a nota bimestral do usuário 1: ");
        notaBimestral = scan.nextDouble();
        System.out.print("Digite a nota bimestral do usuário 2: ");
        notaBimestral1 = scan.nextDouble();
        System.out.print("Digite a nota bimestral do usuário 3: ");
        notaBimestral2 = scan.nextDouble();
        
        System.out.print("Digite a nota semestral do usuário 1: ");
        notaSemestral = scan.nextDouble();
        System.out.print("Digite a nota semestral do usuário 2: ");
        notaSemestral1 = scan.nextDouble();
        System.out.print("Digite a nota semestral do usuário 3: ");
        notaSemestral2 = scan.nextDouble();
        
       
        media = (notaMensal + notaBimestral + notaSemestral)/3; 
        media1 = (notaMensal1 + notaBimestral1 + notaSemestral1)/3; 
        media2 = (notaMensal2 + notaBimestral2 + notaSemestral2)/3; 


        
        System.out.println("Olá " + name + ", você está matriculado no curso " 
                + curso + "e sua média foi de " + media + ".");
        
        System.out.println("Olá " + name1 + ", você está matriculado no curso " 
                + curso1 + "e sua média foi de " + media1 + ".");
        
        System.out.println("Olá " + name2 + ", você está matriculado no curso " 
                + curso2 + "e sua média foi de " + media2 + ".");
        
        
        
        
        
        
        
    }
    
}
