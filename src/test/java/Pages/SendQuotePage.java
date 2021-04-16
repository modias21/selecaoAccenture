package Pages;

import org.openqa.selenium.By;

public class SendQuotePage extends BasePage {

    public void escreverEmail(String email){
        escrever(By.id("email"), email);
    }

    public void escreverPhone(String email){
        escrever(By.id("phone"), email);
    }

    public void escreverUsername(String email){
        escrever(By.id("username"), email);
    }

    public void escreverPassword(String email){
        escrever(By.id("password"), email);
    }

    public void escreverConfirmPassword(String email){
        escrever(By.id("confirmpassword"), email);
    }

    public void escreverComments(String email){
        escrever(By.id("Comments"), email);
    }

    public void cliarNext(){
        clicar(By.id("sendemail"));
    }
}
