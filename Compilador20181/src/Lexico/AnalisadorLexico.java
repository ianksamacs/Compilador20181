/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import java.util.ArrayList;

/**
 *
 * @author Joimar
 */
public class AnalisadorLexico 
{
    
    private final int status_palavra_reservada = 0;
    private final int status_id = 1;
    private final int status_numero = 2;
    private final int status_op_ari = 3;
    private final int status_op_relacional = 4;
    private final int status_op_logico = 5;
    private final int status_comentario = 6;
    private final int status_delimitador = 7;
    private final int status_cadeia = 8;
    private final int status_neutro = 9;
    
    private final String tipo_palavra_reservada = "Palavra Reservada";
    private final String tipo_id = "Identificador";
    private final String tipo_numero = "Numero";
    private final String tipo_op_ari = "Operador Aritmetico";
    private final String tipo_op_relacionais = "Operador Relacional";
    private final String tipo_op_logico = "Operador Logico";
    //private final String tipo_comentario = "Identificador";
    private final String tipo_delimitador = "Delimitador";
    private final String tipo_cadeia = "Cadeia de Caracteres";
    
    private ArrayList<String> codigo;
    
    private int status;
    
    private final ArrayList<Token> tokens;
    
    private final  ArrayList<Token> erros;
    
    AnalisadorLexico(ArrayList<String> codigo)
    {
    
        this.codigo = codigo;
        
        this.tokens = new ArrayList<>();
        this.erros = new ArrayList<>();
        this.status = status_neutro;
    }
    public boolean verificaPalavraReservada(String palavra)
    {
    
        if(palavra.equals("const") || palavra.equals("var") || palavra.equals("struct") || palavra.equals("typedef") || 
                palavra.equals("procedure") || palavra.equals("function") || palavra.equals("return") || palavra.equals("start") ||
                palavra.equals("if") || palavra.equals("then") || palavra.equals("else") || palavra.equals("while")
                || palavra.equals("scan") || palavra.equals("print") || palavra.equals("int") || palavra.equals("float") || palavra.equals("bool")
                || palavra.equals("string") || palavra.equals("true") || palavra.equals("false") || palavra.equals("extends"))
        {
        
            return true;
        }
        
        else return false;
    }
     
    
     
    public void analise()
    {
    
        switch(status)
        {
        
            case status_neutro:
                
                
        
        }
    
    }
    
}
