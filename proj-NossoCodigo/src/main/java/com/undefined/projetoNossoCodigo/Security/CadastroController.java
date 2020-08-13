package com.undefined.projetoNossoCodigo.Security;

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
    private UsuarioRepository usuarioRepository;
    
    @GetMapping("/cadastro")
    public String cadastro(){
      return "cadastro";
    }

    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewUsuario (
         @RequestParam String login
        ,@RequestParam String senha
        ,@RequestParam String email
        ) {

            Usuario u = new Usuario();

            u.setLogin(login);
            u.setSenha(senha);
            u.setEmail(email);

            usuarioRepository.save(u);
            
            return "login";
    }

}