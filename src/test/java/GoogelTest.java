import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class GoogelTest extends Base{


    @Test
    public void kursNBP(){
        webDriver.navigate().to("http://google.pl");
        WebElement input = webDriver.findElement(By.name("q"));
        input.sendKeys("kurs NBP");
        input.submit();
        assertTrue(webDriver.getTitle().contains("kurs NBP"));
    }

}

