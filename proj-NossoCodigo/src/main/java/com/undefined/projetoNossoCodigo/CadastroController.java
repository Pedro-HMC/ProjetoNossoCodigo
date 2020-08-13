package com.undefined.projetoNossoCodigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;
    private Usuario lista = new Usuario();

    @GetMapping("/cadastro")
    public String cadastro(){
      return "cadastro";
    }

    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewUsuario (
         @RequestParam String nome
        ,@RequestParam Integer senha
        ,@RequestParam String email
        ) {

            Cadastro c = new Cadastro();

            c.setNome(nome);
            c.setSenha(senha);
            c.setEmail(email);

            cadastroRepository.save(c);
            
            return "login";
    }

    @GetMapping(path="/lista")
    public @ResponseBody String getAllUsuario() {

      Iterable<Cadastro> resultado = cadastroRepository.findAll();
      
      return lista.listaUsuario(resultado);
    }

   

}