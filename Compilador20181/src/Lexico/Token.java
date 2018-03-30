/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

/**
 *
 * @author Joimar
 */
public class Token 
{
    private int linha;
    private String valor;
    
   Token(int linha, String valor)
   {
       this.linha = linha;
       this.valor = valor;
   }
   
   
   public void setLinha(int linha)
   {
   
       this.linha = linha;
   }
   
   public int getLinha()
   {
       return linha;
   }
   
   public void setValor(String valor)
   {
   
       this.valor = valor;
   }
   
   public String getValor()
   {
   
       return valor;
   }
   
}
