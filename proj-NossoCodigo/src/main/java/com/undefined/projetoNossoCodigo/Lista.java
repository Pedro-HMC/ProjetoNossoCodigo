package com.projeto.feedback;

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
    "<body style=\"background-color: #D3BEE4;\">"+
            "<div class=\"menu row\">" +
            "<div class=\"col-sm-1\"></div>" +
            "<div class=\"col-sm-2\">Voltar</div>" +
            "<div class=\"col\"></div>"+
            "</div>" +
            "<div class=\"feedback row\">" +
                "<div class=\"col-sm-6\">"+
                    "<img src=\"/feedback.png\">"+
                "</div>" +
    
           " <div class=\"col-sm-5 formulario\">" +
                "<div style=\"color:black; font-size: x-large;\" class=\"col-\">" +
                   " O quê você achou do nosso site? <br>Dê o seu Feedback!" +
                "</div><br>" +
                "<div class=\"separacao row\"></div> <br>" +
                 "<form action=\"/feedback/insere\" method=\"post\">" +
                        "<div>"+
                            "<label for=\"nome\">Nome:</label>" +
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
                       "<p><input  style=\"color: #302384; background-color: black;\" type=\"submit\" value=\"Enviar\" >"+ "<input style=\"color: #302384; background-color: black;\"  type=\"reset\" value=\"Limpar\" /></p>"+
                    
                    "</form>"+
            "</div>"+
    "</body>";
    

        for(Feedback f : lista){
            html = html +
            "<h1>"+f.getNome()+"</h1>"+
            f.getEmail()+"<br>"+
            f.getMensagem()+"<br>"+
            "<br>"
            ;
        }
        return html;
    }
}