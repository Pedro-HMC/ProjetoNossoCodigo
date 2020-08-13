package com.undefined.projetoNossoCodigo;

public class Lista {
     public String listaFeedback(Iterable<Feedback> lista){
        String html = "<head>" +
        "<meta charset=\"UTF-8\">" +
        "<title>Feedback</title>" +
        "<link rel=\"stylesheet\" href=\"/feedback.css\">" +
        "<link rel=\"shortcut icon\" href=\"./frame_5.ico\" type=\"image/x-icon\">" +
       " <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">" +
       " <link href=\"https://fonts.googleapis.com/css2?family=Orbitron:wght@700&display=swap\" rel=\"stylesheet\">"+
        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> " +
    "</head>" +

    "<body  style=\"background-color: #D3BEE4;\">"+
        "<div id=\"pagina1\">"+
        "<div class=\"menu\">" +
            "<div style=\"margin-bottom:10px;\" class=\" row\">" +
                "<div class=\"col-sm-1\"></div>" +
                "<div class=\"col-sm-2\"><a style=\"color:white;\" href=\"/inicial\">Voltar</a></div>" +
            "</div>" +
        "</div>"+
            "<div class=\"feedback row\">" +
                    "<div class=\"col-sm-6\">"+
                        "<img src=\"/feedback.png\">"+
                    "</div>" +
        
            "<div class=\"col-sm-5 formulario\">" +
                    "<div style=\"color:#1f2124; font-size: x-large; padding-top: 8px;\" class=\"col-\">" +
                    " O quê você achou do nosso site? <br>Dê o seu Feedback!" +
                    "</div><br>" +
                    "<div class=\"separacao row\"></div> <br>" +
                    "<form action=\"/feedback/insere\" method=\"post\">" +
                            "<div>"+
                                "<label style=\"margin-right: 2px\" for=\"nome\">Nome:  </label>" +
                                "<input type=\"text\" id=\"nome\" name=\"nome\"/>" +
                            "</div>"+
                            "<div>" +
                                "<label for=\"email\">E-mail:</label>"+
                                "<input type=\"email\" id=\"email\" name=\"email\"/>"+
                            "</div>"+
                            "<div>"+
                                "<label for=\"msg\">Mensagem:</label>"+
                                "<textarea id=\"msg\" name=\"mensagem\"></textarea>"+
                            "</div><br>"+
                        "<p><input  type=\"submit\" value=\"Enviar\" >"+ "<input type=\"reset\" value=\"Limpar\" /></p>"+
                        
                        "</form>"+
            "</div>"+
        "</div>"+
        "<br>"+
        "<br>"+

        "<p> Comentários <p>"+

        "<div  id=\"pagina1\" class=\"secao\">"+
            "<a href=\"#pagina2\">"+
                "<span class=\"icone-scroll\">"+
                    "<span class=\"scroll-next scroll\"></span>"+
                "</span>"+
            "</a>"+
        "</div>";
            for(Feedback f : lista){
                html = html + 
                    "<div id=\"pagina2\" class= \"comentarios row\">"+
                            "<div class=\"col-sm-1\">"+
                                "<img class=\"circle\" src=\"/incognito.png\">"+
                            "</div>"+
                            "<div class=\"col-sm-11\">"+
                                "<div style=\"font-size:20px;\" class= \"row\">"+
                                     f.getNome()+
                                "</div>"+
                                "<div class=\"row\">"+
                                    f.getMensagem()+
                                "</div>"+
                            "</div>"+
                    "</div>";
                    

        }
        return html;
        }
    }
