/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ramon
 */
public class Departamento {
    int id;
    String nome;
    int idContato;

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
    
    
    
}
