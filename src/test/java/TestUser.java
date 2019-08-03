import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestUser extends Base {
    @Test
    public void testHovers() {
        webDriver.navigate().to("http://the-internet.herokuapp.com/hovers");
        List<WebElement> parentElements = webDriver.findElements(By.className("figure"));
        int i = 1;
        for (WebElement parentElement : parentElements) {
            WebElement image = parentElement.findElement(By.tagName("img"));
            Actions actions = new Actions(webDriver);
            actions.moveToElement(image).perform();
            WebElement h5 = parentElement.findElement(By.cssSelector(".figcaption h5"));
            assertTrue(h5.isDisplayed());
            assertEquals("name: user" + i++, h5.getText());
        }
    }
}
