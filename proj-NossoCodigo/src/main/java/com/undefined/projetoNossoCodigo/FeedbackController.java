package com.undefined.projetoNossoCodigo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;
    private Lista lista = new Lista();

    @GetMapping("/")
    public @ResponseBody String feedback(){
        return lista.listaFeedback(feedbackRepository.findAll());
    }
    
    
    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewFeedback (
         @RequestParam String nome
        ,@RequestParam String email
        ,@RequestParam String mensagem
        ) {

            Feedback f = new Feedback();

            f.setNome(nome);
            f.setEmail(email);
            f.setMensagem(mensagem);
            feedbackRepository.save(f);

            return lista.listaFeedback(feedbackRepository.findAll());
        }

    @GetMapping(path="/lista")
    public @ResponseBody String getAllFeedback() {

      Iterable<Feedback> resultado = feedbackRepository.findAll();
      
      return lista.listaFeedback(resultado);
    } 

 @GetMapping(path="/updateForm")
    public String updateForm(){
      return "updateForm";
    }

    @PostMapping(path="/update")
    public @ResponseBody String updateFeedback(@RequestParam String mensagem, @RequestParam Integer id) {
        Optional<Feedback> o = feedbackRepository.findById(id);

        if(o.isPresent()){
          Feedback f = o.get();
          f.setMensagem(mensagem);
          feedbackRepository.save(f);
        }
          return "updateResposta";
        }

}
