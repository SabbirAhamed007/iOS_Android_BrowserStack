package browserstack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Mac_Mojave_Safari12_1 {

	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "Mojave");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("browser", "Safari");
	    caps.setCapability("browser_version", "12.1");
	    caps.setCapability("os", "OS X");
	    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
	    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.buyrentbd.com");


	 // links -- //a href <http://www........com>
		// images --//img href <http://www.......com>

		// 1. get the list of all links and images: suppose 500

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		linkList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images--->" + linkList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>(); 
		
		// 450 which has href
        // 2. iterate linkList : exclude all the links/Images - doesnot have any href attibute

		for (int i = 0; i < linkList.size(); i++) {

			System.out.println(linkList.get(i).getAttribute("href"));

			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(linkList.get(i));

			}

		}

		// get the size of active links list:

		System.out.println("size of active links and images--->" + activeLinks.size());

		// 3. check the href url, with httpconnection api:
		// 200 = OK
		// 404 = not found
		// 500 = internal error
		// 400 = bad request

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();

			String response = connection.getResponseMessage(); // OK

			connection.disconnect();

			System.out.println(activeLinks.get(j).getAttribute("href") + "--->" + response);
			
			driver.quit();

		}

	  }
}
