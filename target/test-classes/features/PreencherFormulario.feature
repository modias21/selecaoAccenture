#language: pt

Funcionalidade: Verificar a solicitação de seguro de veículos

  Cenário: Preencher os formulários de solicitação de seguros corretamente e verificar se foi cadastrado com sucesso.
    Dado que eu queira fazer uma cotação para o seguro no site "http://sampleapp.tricentis.com/101/app.php"
    Quando preencho o formulário Enter Vehicle Data
    E preencho o formulário Enter Insurant Data
    E preencho o formulário Enter Product Data
    E preencho o formulário Select Price Option
    E preencho o formulário Send Quote
    Então a cotação deve ser enviada para o email e apresentar a mensagem de socesso "Sending e-mail success!"