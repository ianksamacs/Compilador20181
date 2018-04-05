/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Lexico.AnalisadorLexico;
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
    
  public void compilar() throws FileNotFoundException, IOException {

        ArrayList<String> localFiles = arquivo.lerCodigos(); // Recebe a lista com todos os códigos da pasta.
        if (localFiles.isEmpty()) { // Pasta de códigos de entrada vazia.
            System.out.println("Sem Códigos para Compilar");
            System.exit(0);
        }
        for (String lF : localFiles) { // Para cada arquivo fonte, o analisador léxico gera as listas de tokens e erros (se houver).
           // Scanner scan = new Scanner(new FileReader(lF));
            //ArrayList<String> codigoFonte = arquivo.lerCodigoFonte(lF);
            ArrayList<String> codigoFonte = arquivo.lerCodigoFonte(lF);
            AnalisadorLexico analisadorLexico = new AnalisadorLexico();
            analisadorLexico.analise(codigoFonte);
            
            arquivo.escreverSaidaLexico(analisadorLexico.getTokens(), analisadorLexico.getErros());
            
          //  arquivo.escreverSaidaLexico(analisadorLexico.getTokens(), analisadorLexico.getErros());
            
          //  analisadorSintatico = new AnalisadorSintatico(analisadorLexico.getTokens());
        }
         
        // Arquivo arquivo = new Arquivo();
        // arquivo.escreverSaidaLexico(null, null);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pro inferno");
        
         try 
                {
                    Main compilador = new Main(); // Cria o compilador.
                    compilador.compilar(); // Executa o compilador.
            
                } 
                catch (FileNotFoundException error1) 
                {
                    
                    System.out.println("Arquivo não encontrado");
                    System.exit(0);
                }
                catch (IOException ex) 
                {
                    System.out.println("Arquivo de saida não foi gerado com sucesso");
                    System.exit(0);
                }
              
    }
    
}
