package com.undefined.projetoNossoCodigo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //faz com que o banco de dados crie uma tabela para esse objeto
public class tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String nome;

    String conteudo;

    String descricao;

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getConteudo(){
        return this.conteudo;  
    }

    public String getNome(){
        return this.nome;  
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Integer getId(){
        return this.id;
    }

}