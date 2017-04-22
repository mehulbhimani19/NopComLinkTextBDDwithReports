import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
;



/**
 * Created by Mehul on 30/11/2016.
 */
public class logInStepDeft extends DriverManager

{
    @Given("^I am homepage of nop commerce$")
    public void i_am_homepage_of_nop_commerce()
    {
      openBrowser();

    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String product )
    {
        driver.findElement(By.linkText(product)).click();
    }

    @Then("^I should see \"([^\"]*)\" of particular  category \\.$")
    public void i_should_see_of_particular_category(String result)

    {
        Assert.assertEquals(driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[1]/h1")).getText(),result);
        closeBrowser();
    }

}
