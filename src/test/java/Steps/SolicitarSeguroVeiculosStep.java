package Steps;

import Pages.*;
import Utils.GerarDataUtil;
import io.cucumber.java.pt.*;

public class SolicitarSeguroVeiculosStep {

    private BasePage basePage = new BasePage();
    private EnterVehicleDataPage vehicleData = new EnterVehicleDataPage();
    private EnterInsurantDataPage insurantData = new EnterInsurantDataPage();
    private EnterProductDataPage productData = new EnterProductDataPage();
    private SelectPriceOptionPage priceOption = new SelectPriceOptionPage();
    private SendQuotePage sendQuote = new SendQuotePage();
    private AlertPage alert = new AlertPage();

    private GerarDataUtil data = new GerarDataUtil();

    @Dado("que eu queira fazer uma cotação para o seguro no site {string}")
    public void queEuQueiraFazerUmaCotaçãoParaOSeguroNoSite(String string) {
        basePage.acessarUrl(string);
    }

    @Quando("preencho o formulário Enter Vehicle Data")
    public void preenchoOFormulárioEnterVehicleData() {
        vehicleData.selectMake("Ford");
        vehicleData.selectModel("Three-Wheeler");
        vehicleData.escreverCylinderCapacity("45");
        vehicleData.escreverEnginePerformance("332");
        vehicleData.escreverDateOfManufacture(data.gerarData(-1));
        vehicleData.selectNumberOfSeats("7");
        vehicleData.selectRightHandDrive("yes");
        vehicleData.selectNumberOfSeatsMotorcycle("3");
        vehicleData.selectFuelType("Gas");
        vehicleData.escreverPayload("10");
        vehicleData.escreverTotalWeight("1000");
        vehicleData.escreverListPrice("50000");
        vehicleData.escreverLicensePlateNumber("50");
        vehicleData.escreverAnnualMileage("50456");
        vehicleData.clicarNext();
    }

    @Quando("preencho o formulário Enter Insurant Data")
    public void preenchoOFormulárioEnterInsurantData() throws Exception {
        insurantData.escreveFirstName("Jose");
        insurantData.escreveLasttName("Silva");
        insurantData.escreveDateOfBirth("10/08/1994");
        insurantData.selectGender("Female");
        insurantData.escreveStreetAddress("Rua São Francisco");
        insurantData.selectCountry("Brazil");
        insurantData.escreveZipCode("74000000");
        insurantData.escreveCity("Goiânia");
        insurantData.selectOccupation("Farmer");
        insurantData.selectHobbie("Speeding");
        insurantData.escreveWebSite("https://www.linkedin.com/in/murillo-oliveira-dias-333286126/");
        insurantData.selectImagem();
        insurantData.clicarNext();
    }

    @Quando("preencho o formulário Enter Product Data")
    public void preenchoOFormulárioEnterProductData() {
        productData.escreveStartDate(data.gerarData(31));
        productData.selectInsuranceSum("15.000.000,00");
        productData.selectMeritRating("Bonus 7");
        productData.selectDamageInsurance("Full Coverage");
        productData.selectOptionalProducts("Euro Protection");
        productData.selectCourtesyCar("Yes");
        productData.clicarNext();
    }

    @Quando("preencho o formulário Select Price Option")
    public void preenchoOFormulárioSelectPriceOption() {
        priceOption.SelectOption("Gold");
        priceOption.clicarNext();
    }

    @Quando("preencho o formulário Send Quote")
    public void preenchoOFormulárioSendQuote() {
        sendQuote.escreverEmail("teste@teste.com");
        sendQuote.escreverPhone("62985436092");
        sendQuote.escreverUsername("testeUseName");
        sendQuote.escreverPassword("Password123");
        sendQuote.escreverConfirmPassword("Password123");
        sendQuote.escreverComments("Comentário realizado");
        sendQuote.cliarNext();
    }

    @Então("a cotação deve ser enviada para o email e apresentar a mensagem de socesso {string}")
    public void aCotaçãoDeveSerEnviadaParaOEmailEApresentarAMensagemDeSocesso(String string) {
        alert.validarEnvioComSucesso(string);
        alert.clicarOK();
    }
}
