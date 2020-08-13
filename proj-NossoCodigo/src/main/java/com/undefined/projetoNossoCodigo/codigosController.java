package com.undefined.projetoNossoCodigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nossoCodigo")
public class codigosController {

    /* aa */
    @Autowired
    private tagRepository tagRepository;
    private exibeCodigos exibeCodigos = new exibeCodigos();

    @Autowired
    private jcodeRepository jcodeRepository;
    private exibeJcode exibeJcode = new exibeJcode();

    @Autowired
    private javaSRepository javaSRepository;
    private exibeJS exibeJS = new exibeJS();

    @Autowired
    private mySQLRepository mySQLRepository;
    private exibeMySQL exibeMySQL = new exibeMySQL();

    @Autowired
    private cssRepository cssRepository;
    private exibeCSS exibeCSS = new exibeCSS();

    @GetMapping("/codigos1")
    public @ResponseBody String getAllTag(){
        return exibeCodigos.mostraCodigos(tagRepository.findAll());
    }

    @PostMapping("/codigos1")
    public @ResponseBody String addNovoCodigo(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        tag t = new tag();
        t.setNome(nome);
        t.setConteudo(conteudo);
        t.setDescricao(descricao);
        tagRepository.save(t);

        return exibeCodigos.mostraCodigos(tagRepository.findAll());
    }
    
    @PostMapping("/codigos2")
    public @ResponseBody String addNovoJcode(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        jcode j = new jcode();
        j.setNome(nome);
        j.setConteudo(conteudo);
        j.setDescricao(descricao);
        jcodeRepository.save(j);

        return exibeJcode.mostraJcode(jcodeRepository.findAll());
    }

    @GetMapping("/codigos2")
    public @ResponseBody String getAllJcode(){
        return exibeJcode.mostraJcode(jcodeRepository.findAll());
    }

    @PostMapping("/codigos3")
    public @ResponseBody String addNovoJS(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        javaS js = new javaS();
        js.setNome(nome);
        js.setConteudo(conteudo);
        js.setDescricao(descricao);
        javaSRepository.save(js);

        return exibeJS.mostraJS(javaSRepository.findAll());
    }

    @GetMapping("/codigos3")
    public @ResponseBody String getAllJavaS(){
        return exibeJS.mostraJS(javaSRepository.findAll());
    }

    @PostMapping("/codigos4")
    public @ResponseBody String addNovoSQL(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        mySQL sql = new mySQL();
        sql.setNome(nome);
        sql.setConteudo(conteudo);
        sql.setDescricao(descricao);
        mySQLRepository.save(sql);

        return exibeMySQL.mostraSQL(mySQLRepository.findAll());
    }

    @GetMapping("/codigos4")
    public @ResponseBody String getAllSQL(){
        return exibeMySQL.mostraSQL(mySQLRepository.findAll());
    }

    @PostMapping("/codigos5")
    public @ResponseBody String addNovoCSS(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        css cs = new css();
        cs.setNome(nome);
        cs.setConteudo(conteudo);
        cs.setDescricao(descricao);
        cssRepository.save(cs);

        return exibeCSS.mostraCSS(cssRepository.findAll());
    }

    @GetMapping("/codigos5")
    public @ResponseBody String getAllCSS(){
        return exibeCSS.mostraCSS(cssRepository.findAll());
    }

    @PostMapping("/deleteH")
    public @ResponseBody String deletarCodigoH(@RequestParam Integer id){
        tagRepository.deleteById(id);
        return exibeCodigos.mostraCodigos(tagRepository.findAll());
    }
    @PostMapping("/deleteCS")
    public @ResponseBody String deletarCodigoCS(@RequestParam Integer id){
        cssRepository.deleteById(id);
        return exibeCSS.mostraCSS(cssRepository.findAll());
    }
    @PostMapping("/deleteJ")
    public @ResponseBody String deletarCodigoJ(@RequestParam Integer id){
        jcodeRepository.deleteById(id);
        return exibeJcode.mostraJcode(jcodeRepository.findAll());
    }
    @PostMapping("/deleteJS")
    public @ResponseBody String deletarCodigoJS(@RequestParam Integer id){
        javaSRepository.deleteById(id);
        return exibeJS.mostraJS(javaSRepository.findAll());
    }
    @PostMapping("/deleteSQL")
    public @ResponseBody String deletarCodigo(@RequestParam Integer id){
        mySQLRepository.deleteById(id);
        return exibeMySQL.mostraSQL(mySQLRepository.findAll());
    }

    
}
