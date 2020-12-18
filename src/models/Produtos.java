/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author vinit
 */
public class Produtos {
    private String descricao, data_cad, data_update;
    private Float valor;
    private int id, quantidade;
    
   public Produtos(){}
   
   public int getId(){
       return this.id;
   }
   
   public String getDesc(){
       return this.descricao;
   }
   
   public void setDesc(String descricao){
       this.descricao = descricao;
   }
   
   public float getValor(){
       return this.valor;
   }
   
   public void setValor(Float valor) {
       this.valor = valor;
   }
   
   public int getQtde(){
       return this.quantidade;
   }
   
   public void setQtde(int quantidade){
       this.quantidade = quantidade;
   }
   
   public String getDataCad() {
        return this.data_cad;
   }
    
    public void setDataCad(String data_cad) {
 	this.data_cad = data_cad;
    }
    
    public String getDataUpdate() {
 	return this.data_update;
    }
    
    public void setDataUpdate(String data_update) {
 	this.data_update = data_update;
    }
}
