package Steps;

import ConnetionWeb.DriveWeb;
import io.cucumber.java.After;

public class BaseTest {

    DriveWeb driveWeb = new DriveWeb();

    @After
    public void after() {
        try {
            driveWeb.fecharNavegador();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




