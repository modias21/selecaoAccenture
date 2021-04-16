package Pages;

import org.openqa.selenium.By;

public class SelectPriceOptionPage extends BasePage {

    public void clicarNext() {
        clicar(By.id("nextsendquote"));
    }

    public void SelectOption(String opcao) {
        clicar(By.xpath(Option(opcao)));
        selecionado(By.xpath(Option(opcao)));
    }

    public String Option(String opcao) {

        int codigo = 0;
        switch (opcao) {
            case "Silver":
                codigo = 1;
                break;
            case "Gold":
                codigo = 2;
                break;
            case "Platinum":
                codigo = 3;
                break;
            case "Ultimate":
                codigo = 4;
                break;
        }

        return "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[" + codigo + "]/span";
    }
}
