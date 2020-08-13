package com.undefined.projetoNossoCodigo;

public class exibeCodigos {

    public static String formataDados(String conteudo){
        conteudo = conteudo.replaceAll("<","&lt");
        conteudo = conteudo.replaceAll(">","&gt");
        return conteudo;
     }

    public String mostraCodigos(Iterable<tag> tag){
        String html = "<head>" +
        "<meta charset=\"UTF-8\">" +
        "<title>Códigos HTML</title>" +
        "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">" +
        "<link rel=\"stylesheet\" href=\"/css/codigos.css\">" +
        "<link href=\"https://fonts.googleapis.com/css2?family=Orbitron:wght@700&display=swap\" rel=\"stylesheet\">" +
        "<link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@700&display=swap\" rel=\"stylesheet\">" +

    "</head>" +    
    "<body style=\"font-family: \'Orbitron\';background-color: #E0DEDE;\">" +
    
        "<div class=\" row bar \">" + 
            "<div class=\"col-sm-10\">" +
            "<p class=\"tag smooth-scroll list-unstyled\">Tags:" +
            "<a class=\"tag\" href=\"#scroll1\">Novo Código, </a>" +
            "<a class=\"tag\" href=\"#68\">Olá Mundo, </a>" +
            "<a class=\"tag\" href=\"#90\">Links/Comentários, </a>" +
            "<a class=\"tag\" href=\"#101\">Tabelas, </a>" +
            "<a class=\"tag\" href=\"#102\">Formulários </a>" +
            "</p>" +
            "</div>" +
            "<div class=\"col-sm-2\">" +
                "<p class=\"voltar\"><a href=\"/inicial\">Voltar</a></p>" +
            "</div>" +
        "</div>" +
        "<div class=\"row\">" +
            "<div class=\"col-SM-2 titulo\">" +
                "<h2>HTML</h2>" +
            "</div>" +
            "<div class=\"col\"></div>" +
        "</div>";
        

        for(tag t : tag){
            html = html +
            "<div class=\"row\">" +
                "<div class=\"col-sm-1\"></div>" +
                "<div class=\"col-sm-5 block\">" +
                    "<div class=\"row\">" +
                        "<div id="+ t.getId() +"><h2>"+ t.getNome()+"</h2></div>" +
                    "</div>" +
                    "<div class=\"row\">" +
                        "<div class=\"col codebox block\">" +
                            "<pre>" + formataDados(t.getConteudo()) + "</pre>"+ "<br>"+
                        "</div>" +
                    "</div>" +
                "</div>" +
                "<div class=\"col-sm-5 block\">" +
                    "<div class=\"row\">"+
                        "<h2>Descrição</h2>"+
                    "</div>"+
                    "<div class=\"row\">"+
                    "<div class=\"col codebox block\">"+
                           " <pre>" + formataDados(t.getDescricao()) + "</pre>"+
                        "</div>"+
                    "</div>"+ 
                 "</div>" +
                "<div class=\"col-sm-1\"></div>" +
            "</div>" + 
            "<br>" +
            "<div class=\"row\">"+
                "<div class=\"col\"></div>"+
                "<div class=\"col-\">"+
                    "<form action=\"/nossoCodigo/deleteH\" method=\"POST\">"+
                        "<input type=\"hidden\" name=\"id\" value=" + t.getId()  + ">" +
                        "<input type=\"submit\" value=\"Deletar Código\">"+
                    "</form>"+
                "</div>" +
                "<div class=\"col\"></div>"+
            "</div>" + 
            "<br>"
            ;
        }
        html = html + 
        "<div class=\"row\">" +
            "<div class=\"col\"></div>" +
            "<div class=\"col-sm-8\">"+
                "<form action=\"/nossoCodigo/codigos1\" method=\"post\">"+
                    "<div id=\"scroll1\" class=\"row\">"+
                        "<div class=\"col\"></div>" +
                        "<div class=\"col-\">INSIRA UM NOVO CÓDIGO</div>"+
                        "<div class=\"col\"></div>" +
                    "</div>"+
                    "<div class=\"row\">"+
                        "<div class=\"col-sm-3\">"+
                            "<label for=\"nome\">Titulo:</label>" +
                        "</div>"+
                        "<div class=\"col-sm-9\">"+
                            "<input type=\"text\" id=\"nome\" name=\"nome\">" +
                        "</div>"+
                    "</div>"+
                    "<div class=\"row novobicho\">"+
                        "<div class=\"col-sm-3\">"+ 
                            "<label for=\"conteudo\">Código:</label>"+
                        "</div>" +
                        "<div class=\"col-sm-9\">" +
                            "<textarea class=\"code\" type=\"text\" id=\"conteudo\" name=\"conteudo\"></textarea>"+
                        "</div>" +
                    "</div>" +
                    "<div class=\"row\">" +
                        "<div class=\"col-sm-3\">" +
                            "<label for=\"descricao\">Descrição:</label>"+
                        "</div>"+
                        "<div class=\"col-sm-9\">"+
                            "<textarea class=\"code\" type=\"text\" id=\"descricao\" name=\"descricao\"></textarea>"+"<br>"+
                        "</div>"+
                    "</div>"+
                    "<p style=\"text-align: center;\"><input type=\"submit\" value=\"Enviar\" /></p>"+
                "</form>" +
            "</div>" +
        "<div class=\"col\"></div>"+
        "</div>"+
"</body>";
        return html;
    }
}