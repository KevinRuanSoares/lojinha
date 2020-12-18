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
public class Venda {
    public int id, quantidade, clientes_id, usuarios_id;
    public String metodo_pagamento, data_cad, data_update;
    public Float valor;
    
    public int getId(){
        return this.id;
    }
    
    public int getQtde(){
        return this.quantidade;
    }
    
    public void setQtde(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getCliId(){
        return this.clientes_id;
    }
    
    public void setCliId(int clientes_id){
        this.clientes_id = clientes_id;
    }
    
    public int GetUserId(){
        return this.usuarios_id;
    }
    
    public void setUserId(int usuarios_id){
        this.usuarios_id = usuarios_id;
    }
    
    public String getMtdPag(){
        return this.metodo_pagamento;
    }
    
    public void setMtdPag(String metodo_pagamento){
        this.metodo_pagamento = metodo_pagamento;
    }
    
    public Float getValor(){
        return this.valor;
    }
    
    public void setValor(Float valor){
        this.valor = valor;
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
