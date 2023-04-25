/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandolistas;

import java.util.ArrayList;

/**
 *
 * @author M. Washington
 * Estudado na aula mas fora do curso. Estudando por conta própria.
 */
public class TestandoListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
//        aulas.remove(0);
        
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        
        
        
        
    }
    
}
