package aula3.pkg12.pkg04.pkg23;

import java.util.Scanner;

public class Aula3120423 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
        
        String name;
        String product;
        int quantityProduct;
        double unitPrice;
        double result;
        
        System.out.print("Client name: ");
        name = scan.nextLine();
        
        System.out.print("Product: ");
        product = scan.nextLine();
        
        System.out.print("Quantity: ");
        quantityProduct = scan.nextInt();
        
        System.out.print("Unit Price: $");
        unitPrice = scan.nextDouble();
        
        System.out.println("Hello " + name + "!");
        System.out.println("Your product was " + product +".");
        System.out.println("And the amount was " + quantityProduct + ".");
        
        result = quantityProduct * unitPrice;
        
        System.out.println("Total Price: $" + result);
        
        
    }
    
} 