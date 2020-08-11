package com.undefined.projetoNossoCodigo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    String nome;

    String email;

    String mensagem;

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setMensagem(String mensagem){
        this.mensagem= mensagem;
    }

    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}