$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PreencherFormulario.feature");
formatter.feature({
  "name": "Verificar a solicitação de seguro de veículos",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Preencher os formulários de solicitação de seguros corretamente e verificar se foi cadastrado com sucesso.",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que eu queira fazer uma cotação para o seguro no site \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.queEuQueiraFazerUmaCotaçãoParaOSeguroNoSite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulário Enter Vehicle Data",
  "keyword": "Quando "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.preenchoOFormulárioEnterVehicleData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulário Enter Insurant Data",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.preenchoOFormulárioEnterInsurantData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulário Enter Product Data",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.preenchoOFormulárioEnterProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulário Select Price Option",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.preenchoOFormulárioSelectPriceOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulário Send Quote",
  "keyword": "E "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.preenchoOFormulárioSendQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a cotação deve ser enviada para o email e apresentar a mensagem de socesso \"Sending e-mail success!\"",
  "keyword": "Então "
});
formatter.match({
  "location": "SolicitarSeguroVeiculosStep.aCotaçãoDeveSerEnviadaParaOEmailEApresentarAMensagemDeSocesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});