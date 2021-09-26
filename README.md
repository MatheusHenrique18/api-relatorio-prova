# api-relatorio-prova

<h3>PROJETO CRIADO PARA GERAR BINÁRIO DE UM PDF CRIADO PELO JASPER REPORTS, RECEBENDO COMO ENTRADA UM JSON POSSUINDO EM SEU CONTEÚDO LISTA DENTRO DE LISTA. API FOI PUBLICADA NA NUVEM DO HEROKU, SEGUE ABAIXO UM EXEMPLO PARA TESTAR A REQUISIÇÃO (UTILIZAR POSTMAN OU SEMELHANTES):</h3>

<li><b>REQUISIÇÃO DO TIPO -></b> POST</li>
<li><b>URI -></b> https://api-relatorio-prova.herokuapp.com/api/relatorio/gerarPDF </li>
<li><b>BODY -></b></li>
<pre><code>
{
    "professor": "Albert Einstein",
    "descricaoProva": "Prova para Aferimento de Conhecimentos Básicos - P1",
    "listaMaterias": [
        {
            "nomeMateria": "Português",
            "listaQuestoes": [
                {
                    "descricaoQuestao": "Qual o seu nome ?",
                    "resposta": "Matheus"
                },
                {
                    "descricaoQuestao": "Qual o diminutivo de Golfinho ?",
                    "resposta": "Golfinhozinho"
                },
                {
                    "descricaoQuestao": "Qual o aumentativo de Tubarão ?",
                    "resposta": "Tubarãozão"
                }
            ]
        },
        {
            "nomeMateria": "Matemática",
            "listaQuestoes": [
                {
                    "descricaoQuestao": "Quanto é 1+1 ?",
                    "resposta": "2"
                },
                {
                    "descricaoQuestao": "Qual a raiz quadrada de PI ?",
                    "resposta": "Não faço ideia"
                },
                {
                    "descricaoQuestao": "Quanto é 3+3 ?",
                    "resposta": "6"
                }
            ]
        }
    ]
}
</code></pre>

<li><b>PEGAR O BINÁRIO DE RESPOSTA E ATRIBUIR A VARIÁVEL "response" NO PRÓPRIO NAVEGADOR -></b> var response = "BINÁRIO AQUI"; </li>
<li><b>EXECUTAR O COMANDO -></b> window.open('data:application/pdf;base64,' + response, '', 'width=700px,height=900px'); </li>
