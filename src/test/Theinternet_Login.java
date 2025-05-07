package test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Theinternet_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= DriverSetup.CreateDRiver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.quit();
	}

}
