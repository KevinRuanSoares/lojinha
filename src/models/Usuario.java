/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utils.ConvertToMd5 ;

/**
 *
 * @author kevin
 */
public class Usuario {
    private String login, senha, data_cad, data_update;
    private int id;
    private boolean admin, funcionario;

    public Usuario (){ }
    
    public int getId() {
 	return this.id;
    }
    
    public String getLogin() {
 	return this.login;
    }

    public void setLogin(String login) {
           this.login = login;
    }
    
    public String getSenha() {
 	return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean getAdmin() {
 	return this.admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public boolean getFuncionario() {
 	return this.funcionario;
    }
    
    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
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

