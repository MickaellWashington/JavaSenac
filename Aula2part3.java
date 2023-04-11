package aula2part3;

import java.util.Scanner;

public class Aula2part3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); 
        
            String name;
            int age;
            double salary;
            
            System.out.println("Your name: ");
            name = read.nextLine();
            
            System.out.println("Your age: ");
            age = read.nextInt();
            
            System.out.println("Your salary: ");
            salary = read.nextDouble();
             
            System.out.println("Your name is: "+name);
            System.out.println("Your age is: "+age);
            System.out.println("Your salary is: "+salary);
    }
    
}
