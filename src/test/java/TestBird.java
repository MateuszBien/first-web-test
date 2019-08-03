import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;
public class TestBird extends Base {

        @Test
        public void testBirds(){
            webDriver.navigate().to("https://jpetstore.cfapps.io/catalog");
            webDriver.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]")).click();
            WebElement header = webDriver.findElement(By.tagName("h2"));
            assertEquals("Birds",header.getText());
            assertNotSame(0,webDriver.
                    findElements(By.tagName("td"))
                    .size());
        }
    }

