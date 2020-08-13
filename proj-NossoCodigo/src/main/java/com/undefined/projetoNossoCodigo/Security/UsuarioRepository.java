package com.undefined.projetoNossoCodigo.Security;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

    Usuario findByLogin(String login);
}
    
