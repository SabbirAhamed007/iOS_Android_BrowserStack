package browserstack;

import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Browserstacktest {
	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "13");
	    caps.setCapability("device", "iPhone XS");
	    caps.setCapability("real_mobile", "true");
	    caps.setCapability("project", "buyrentbd");
	    caps.setCapability("build", "1.1");
	    caps.setCapability("name", "Test1");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.networkLogs", "true");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://buyrentbd.com");
	    long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-name")).clear();
		driver.findElement(By.id("cfos-name")).sendKeys("Sabbir Ahamed" + currentTime);
		
		driver.findElement(By.id("cfos-email")).clear();
		driver.findElement(By.id("cfos-email")).sendKeys("sabbirahamedcs@gmail.com" + currentTime);
	
		driver.findElement(By.id("cfos-number")).clear();
		driver.findElement(By.id("cfos-number")).sendKeys("8622324967" + currentTime);
		
		driver.findElement(By.id("cfos-message")).clear();
		driver.findElement(By.id("cfos-message")).sendKeys("It's just testing..." + currentTime);
		boolean isDisplayed = driver.findElement(By.id("submit-button")).isDisplayed();

		boolean isEnbled = driver.findElement(By.id("submit-button")).isEnabled();

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
