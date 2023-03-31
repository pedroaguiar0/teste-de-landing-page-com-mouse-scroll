package teste;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.KeysPage;

public class testeMove {

    static WebDriver driver;
    static KeysPage keysPage;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\eluca\\Desktop\\drive\\chromedriver.exe");
        driver.get("http://demo.automationtesting.in/Register.html");
        keysPage = new KeysPage(driver);

        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception{

        keysPage.mouseScroll();

    }

    @After
    public void tearDown() throws Exception{

    }

}
