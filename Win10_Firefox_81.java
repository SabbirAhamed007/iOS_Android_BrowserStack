package browserstack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Win10_Firefox_81 {
	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("browser", "Firefox");
	    caps.setCapability("browser_version", "latest");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
	    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.buyrentbd.com");
	    driver.findElement(By.id("select2-location-container")).click();
	    driver.findElement(By.className("more-details")).click();
	    
	    boolean isDisplayed = driver.findElement(By.id("mc-submit")).isDisplayed();

		boolean isEnbled = driver.findElement(By.id("mc-submit")).isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}
	    driver.quit();
	  }

}
