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
    private String tipo;
    
   Token(int linha, String valor, String tipo)
   {
       this.linha = linha;
       this.valor = valor;
       this.tipo = tipo;
   }
   
   Token(int linha, int valor, String tipo)//Convertendo de float para string, vai que...
   {
       this.linha = linha;
       this.valor = Integer.toString(valor);
       this.tipo = tipo;
   }
   
   Token(int linha, float valor, String tipo)  //Convertendo de float para string, vai que...
   {
       this.linha = linha;
       this.valor = String.valueOf(valor);
       this.tipo = tipo;
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
   
   public void setValor(int valor)
   {
       this.valor = String.valueOf(valor);
   }
   
   public void setValor(float valor)
   {
   
       this.valor = String.valueOf(valor);
   }
   
   public String getValor()
   {
   
       return valor;
   }
   
   public void setTipo(String tipo)
   {
   
       this.tipo = tipo;
   }
   
   public String getTipo()
   {
   
       return tipo;
   }
   
}
