/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Manipulacao_de_arquivo.Arquivo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Joimar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     private final Arquivo arquivo;
     
     public Main() {

        arquivo = new Arquivo(); // Criação do manipulador de entrada e saída.
    }
    
    public void compilar() throws FileNotFoundException, IOException 
    {
    
         ArrayList<String> localFiles = arquivo.lerCodigos(); // Recebe a lista com todos os códigos da pasta.
        if (localFiles.isEmpty()) { // Pasta de códigos de entrada vazia.
            System.out.println("Sem Códigos para Compilar");
            System.exit(0);
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pro inferno");
    }
    
}
