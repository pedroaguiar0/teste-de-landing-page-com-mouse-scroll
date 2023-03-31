package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

public class KeysPage {

    static WebDriver driver;


    public KeysPage (WebDriver driver) {
        this.driver = driver;
    }

    public void mouseScroll() throws InterruptedException  {

        WebElement interection = driver.findElement(By.cssSelector("a[href=\"Interactions.html\"]"));

        Actions act = new Actions(driver);

        act.moveToElement(interection).perform();

        WebElement interection2 = driver.findElement(By.cssSelector("a[href=\"Selectable.html\"]"));
        act.moveToElement(interection2).click().build().perform();

    }

}