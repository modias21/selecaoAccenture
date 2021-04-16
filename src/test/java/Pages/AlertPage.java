package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AlertPage extends BasePage {

    public void validarEnvioComSucesso(String mensagem){
        Assert.assertEquals(obterTexto(By.xpath("//div['sweet-alert showSweetAlert visible']//h2")), mensagem);
    }

    public void clicarOK(){
        clicar(By.xpath("/html/body/div[4]/div[7]/div/button"));
    }
}
