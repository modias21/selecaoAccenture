package Pages;

import org.openqa.selenium.*;

public class EnterVehicleDataPage extends BasePage {

    public void selectMake(String opcao) {
        ComboBox(By.id("make"), opcao);
    }

    public void selectModel(String opcao) {
        ComboBox(By.id("model"), opcao);
    }

    public void selectNumberOfSeats(String opcao) {
        ComboBox(By.id("numberofseats"), opcao);
    }

    public void selectNumberOfSeatsMotorcycle(String opcao) {
        ComboBox(By.id("numberofseatsmotorcycle"), opcao);
    }

    public void selectFuelType(String opcao) {
        ComboBox(By.id("fuel"), opcao);
    }

    public void escreverDateOfManufacture(String valor) {
        escrever(By.id("dateofmanufacture"), valor);
    }

    public void escreverCylinderCapacity(String valor) {
        escrever(By.id("cylindercapacity"), valor);
    }

    public void escreverEnginePerformance(String valor) {
        escrever(By.id("engineperformance"), valor);
    }

    public void escreverPayload(String valor) {
        escrever(By.id("payload"), valor);
    }

    public void escreverTotalWeight(String valor) {
        escrever(By.id("totalweight"), valor);
    }

    public void escreverListPrice(String valor) {
        escrever(By.id("listprice"), valor);
    }

    public void escreverLicensePlateNumber(String valor) {
        escrever(By.id("licenseplatenumber"), valor);
    }

    public void escreverAnnualMileage(String valor) {
        escrever(By.id("annualmileage"), valor);
    }

    public void selectRightHandDrive(String yes_ou_no) {
        if ("yes".equals(yes_ou_no)) {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
            selecionado(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
        } else {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
            selecionado(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
        }
    }

    public void clicarNext() {
        clicar(By.id("nextenterinsurantdata"));
    }

}
