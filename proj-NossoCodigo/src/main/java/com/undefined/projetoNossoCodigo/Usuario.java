package com.undefined.projetoNossoCodigo;

public class Usuario {
    
    String listaUsuario(final Iterable<Cadastro> lista){
        String html = "";

        for(final Cadastro c : lista){
            html = html +
            "<h1>"+c.getNome()+"</h1>"+
            c.getSenha()+"<br>"+
            c.getEmail()+"<br>"+
            "<br>"
            ;
        }
        return html;
    }
}