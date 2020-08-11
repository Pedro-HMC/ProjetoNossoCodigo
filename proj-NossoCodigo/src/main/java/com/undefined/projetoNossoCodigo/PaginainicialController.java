package com.undefined.projetoNossoCodigo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginainicialController {
    
    @GetMapping("/inicial")
    public String paginainicial(){
        return "/Paginainicial";
    }

}