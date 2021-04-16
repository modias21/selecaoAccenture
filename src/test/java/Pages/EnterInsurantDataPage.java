package Pages;

import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class EnterInsurantDataPage extends BasePage {

    public void escreveFirstName(String valor) {
        escrever(By.id("firstname"), valor);
    }

    public void escreveLasttName(String valor) {
        escrever(By.id("lastname"), valor);
    }

    public void escreveDateOfBirth(String valor) {
        escrever(By.id("birthdate"), valor);
    }

    public void escreveStreetAddress(String valor) {
        escrever(By.id("streetaddress"), valor);
    }

    public void escreveZipCode(String valor) {
        escrever(By.id("zipcode"), valor);
    }

    public void escreveCity(String valor) {
        escrever(By.id("city"), valor);
    }

    public void escreveWebSite(String valor) {
        escrever(By.id("website"), valor);
    }

    public void selectCountry(String opcao) {
        ComboBox(By.id("country"), opcao);
    }

    public void selectOccupation(String opcao) {
        ComboBox(By.id("occupation"), opcao);
    }

    public void selectGender(String Male_or_Female) {
        if ("male".toLowerCase().equals(Male_or_Female)) {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
            selecionado(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
        } else {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
            selecionado(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
        }
    }

    public void selectImagem() throws Exception {
        String imagem = "file:///" + System.getProperty("user.dir") + "\\src\\test\\resources\\imagens\\teste.png";

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection str = new StringSelection(imagem);
        clipboard.setContents(str, null);

        clicar(By.id("open"));
        esperar(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        esperar(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        esperar(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        esperar(1000);
    }

    public void selectHobbie(String opcao) {
        clicar(By.xpath(selectNumeroHobbies(opcao)));
    }

    public String selectNumeroHobbies(String valor) {
        int codigo = 0;

        switch (valor) {
            case "Speeding":
                codigo = 1;
                break;
            case "Bungee Jumping":
                codigo = 2;
                break;
            case "Cliff Diving":
                codigo = 3;
                break;
            case "Skydiving":
                codigo = 4;
                break;
            case "Other":
                codigo = 5;
                break;
        }
        String xpath = "(//span[@class='ideal-check'])[" + codigo + "]";

        return xpath;
    }

    public void clicarNext() {
        clicar(By.id("nextenterproductdata"));
    }
}
