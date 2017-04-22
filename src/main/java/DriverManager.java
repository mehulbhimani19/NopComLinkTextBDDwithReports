import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 30/11/2016.
 */
public class DriverManager
{ protected static WebDriver driver ;

    public DriverManager()
    {
        PageFactory.initElements(driver,this );

    }

    public void openBrowser()
    {
        String browser =" ";
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\MultiBrowser\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\MultiBrowser\\IEDriverServer.exe ");
            driver = new InternetExplorerDriver();
        }
        else
            {
                driver = new FirefoxDriver();
            }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");

    }
    public void closeBrowser ()
    {
        driver.quit();
    }


}
