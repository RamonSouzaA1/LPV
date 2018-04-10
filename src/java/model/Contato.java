/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Aluno
 */
public class Contato {
    private int id;
    private String nome;
    private String email;

    public Contato(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Contato(int id, String nome, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
    
    public Contato(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
