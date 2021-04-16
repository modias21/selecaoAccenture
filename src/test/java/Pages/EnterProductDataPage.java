package Pages;

import org.openqa.selenium.By;

public class EnterProductDataPage extends BasePage {

    public void escreveStartDate(String valor) {
        escrever(By.id("startdate"), valor);
    }

    public void selectInsuranceSum(String opcao) {
        ComboBox(By.id("insurancesum"), opcao);
    }

    public void selectMeritRating(String opcao) {
        ComboBox(By.id("meritrating"), opcao);
    }

    public void selectDamageInsurance(String opcao) {
        ComboBox(By.id("damageinsurance"), opcao);
    }

    public void selectCourtesyCar(String opcao) {
        ComboBox(By.id("courtesycar"), opcao);
    }

    public void clicarNext(){
        clicar(By.id("nextselectpriceoption"));
    }

    public void selectOptionalProducts(String opcao){
        clicar(By.xpath(optionalProducts(opcao)));
    }

    public String optionalProducts(String opcao) {

        int codigo = 0;

        switch (opcao) {
            case "Euro Protection":
                codigo = 1;
                break;
            case "Legal Defense Insurance":
                codigo = 2;
                break;
        }

        return "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[" + codigo + "]/span";
    }

}
