package ConnetionWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriveWeb {

	private static WebDriver driverWeb;
	private static ChromeOptions chromeOptions = new ChromeOptions();

	public static WebDriver getDriverWeb() {
		if (driverWeb == null) {
			CreateDriverWebChrome();
			return driverWeb;
		}
		return driverWeb;
	}

	public static void CreateDriverWebChrome() {
		File arquivo = new File("src\\test\\java\\driverNavegador\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", arquivo.getAbsolutePath());
		chromeOptions.addArguments("--window-size=1366,768");//Rodar com a tela com a resolução informada
		driverWeb = new ChromeDriver(chromeOptions);
		driverWeb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverWeb.manage().window().maximize();
	}

	public void fecharNavegador(){
		driverWeb.close();
	}
}