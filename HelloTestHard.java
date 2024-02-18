import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTestHard {
    @Test
    public void testHello1() {
        System.setProperty("java.lang.System", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Иванов Иван Иванович.\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals(expectedResult,actualResult);
        driver.quit();
    }
    @Test
    public void testHello2() {
        System.setProperty("java.lang.System", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
                "На вашу почту (test@test.com) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
    @Test
    public void testHello3() {
        System.setProperty("java.lang.System", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("phone")).sendKeys("+375295971282");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
        "На вашу почту () отправлено письмо.\n" +
        "Наш сотрудник свяжется с вами по телефону: +375295971282.";
        Assert.assertEquals(expectedResult,actualResult);
        driver.quit();
    }
    @Test
    public void testHello4() {
        System.setProperty("java.lang.System", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals(expectedResult,actualResult);
        driver.quit();
    }
    @Test
    public void testHello5() {

        System.setProperty("java.lang.System", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys( "Иванов Иван Иванович");
        driver.findElement(By.name("email")).sendKeys("test@test.ru");
        driver.findElement(By.name("phone")).sendKeys("+375293377992");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Иванов Иван Иванович.\n" +
                "На вашу почту (test@test.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: +375293377992.";
        Assert.assertEquals(expectedResult,actualResult);
        driver.quit();
    }
}
