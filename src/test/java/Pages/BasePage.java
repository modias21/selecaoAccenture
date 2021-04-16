package Pages;

import ConnetionWeb.DriveWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public WebDriver driverWeb = DriveWeb.getDriverWeb();
    private JavascriptExecutor driveJavaScript = (JavascriptExecutor) driverWeb;

    public void encontar(By by) {
        driveJavaScript.executeScript("arguments[0].scrollIntoView(false);", driverWeb.findElement(by));
    }

    public void acessarUrl(String url) {
        driverWeb.navigate().to(url);
    }

    public void clicar(By by) {
        encontar(by);
        driverWeb.findElement(by).click();
    }

    public void ComboBox(By by, String opcao) {
        encontar(by);
        Select combo = new Select(driverWeb.findElement(by));
        combo.selectByVisibleText(opcao);
    }

    public void escrever(By by, String texto) {
        encontar(by);
        driverWeb.findElement(by).clear();
        driverWeb.findElement(by).sendKeys(texto);
    }

    public String obterTexto(By by) {
        encontar(by);
        String texto = driverWeb.findElement(by).getText();
        return texto;
    }

    public static void esperar(int valor) throws InterruptedException {
        Thread.sleep(valor);
    }

    public boolean selecionado(By by) {
        return driverWeb.findElement(by).isSelected();
    }
}
