# api-relatorio-prova

PROJETO CRIADO PARA GERAR BINÁRIO DE UM PDF CRIADO PELO JASPER REPORTS, RECEBENDO COMO ENTRADA UM JSON POSSUINDO EM SEU CONTEÚDO LISTA DENTRO DE LISTA. API FOI PUBLICADA NA NUVEM DO HEROKU, SEGUE ABAIXO UM EXEMPLO PARA TESTAR A REQUISIÇÃO (UTILIZAR POSTMAN OU SEMELHANTES):

REQUISIÇÃO DO TIPO -> POST
URI -> https://api-relatorio-prova.herokuapp.com/api/relatorio/gerarPDF
BODY -> {
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
