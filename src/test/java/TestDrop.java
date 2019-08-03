import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestDrop extends Base{

    @Test
    public void testDropdown(){
        webDriver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        WebElement webElement = webDriver.findElement(By.id("dropdown"));
        Select select = new Select(webElement);
        assertEquals ("Please select an option",select.getFirstSelectedOption().getText());
        for (int i = 0; i <=2 ; i++) {
            select.selectByValue("" + i );
            assertEquals("Option"+ i, select.getAllSelectedOptions().get(0).getText());
        }
    }
}

