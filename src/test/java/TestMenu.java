import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class TestMenu extends Base{

    @Test
    public void testMenu(){
        webDriver.navigate().to("http://akademiakodu.pl");
        String[] titles= {"Facebook", "Darmowy kurs","Youtube", "Grupa facebook",
                "Dofinansowania","Książka"};
        List<WebElement> elements = webDriver.findElements(By.xpath("//div[@class='menu-links']//a"));
        assertEquals(6,elements.size());
        System.out.println("Ilosc"+elements.size());
        for (int i = 0; i < elements.size(); i++) {
            assertEquals(elements.get(i).getText(),titles[i]);
        }
    }
}
