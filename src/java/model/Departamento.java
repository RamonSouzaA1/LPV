/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author Ramon
 */
public class Departamento {
    private int id;
    private String nome;
    private int idContato;
    private Contato contato;
    
    public Departamento(String nome, int idContato) {
        this.nome = nome;
        this.idContato = idContato;
    }

    public Departamento(int id, String nome, int idContato) {
        this.id = id;
        this.nome = nome;
        this.idContato = idContato;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Departamento() {
    }

    public Departamento(int id) {
        this.id = id;
    }

    public Departamento(String nome) {
        this.nome = nome;
    }
    
    public Contato getContato() throws SQLException, ClassNotFoundException {
        if ((contato == null) && (idContato != 0)) {
            contato = Contato.obterContato(idContato);
        }
        return contato;
}
    
}
