import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZadanieTestFioEmailNumber {
    private WebDriver driver;


    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testFioEmailNumber() {

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys( "Иванов Иван Иванович");
        driver.findElement(By.name("email")).sendKeys("test@test.ru");
        driver.findElement(By.name("phone")).sendKeys("+375293377992");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Иванов Иван Иванович.\n" +
        "На вашу почту (test@test.ru) отправлено письмо.\n" +
        "Наш сотрудник свяжется с вами по телефону: +375293377992.";
        Assert.assertEquals( "Неправильный текст приветствия",expectedResult,actualResult);
        driver.quit();

    }
}
