package com.undefined.projetoNossoCodigo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    String nome;

    Integer senha;

    String email;

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(Integer senha){
        this.senha = senha;
    }

    public void setEmail(String email){
        this.email = email;
    }



    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getSenha(){
        return this.senha;
    }

    public String getEmail(){
        return this.email;
    }
}