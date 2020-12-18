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
public class Clientes {
    private String nome, data_cad, data_update;
    private int id;
    
    public Clientes () {}
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
 	return this.nome;
    }

    public void setNome(String nome) {
           this.nome = nome;
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
