package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SeleniumTest {
    //    @Test
//    void checkBrowserTest() {
//        System.setProperty("webdriver.edge.driver",
//                "C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.get("http://www.google.com/");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("GeekBrains");
//        searchBox.submit();
//    }

    /**
     * 5.4 Напишите автоматизированный тест, который выполнит
     * следующие шаги:
     * 1. Открывает главную страницу Google.
     * 2. Вводит "Selenium" в поисковую строку и нажимает
     * кнопку "Поиск в Google".
     * 3. В результатах поиска ищет ссылку на официальный
     * сайт Selenium
     * (https://www.selenium.dev) и проверяет, что ссылка
     * действительно присутствует среди
     * результатов поиска.
     */

    @Test
    void checkBrowserTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        List<WebElement> seleniumLink
                = driver.findElements(By.cssSelector("div.g"));
        boolean a = false;
        for (WebElement webElement : seleniumLink) {
            if (webElement.getText().contains("https://www.selenium.dev")) {
                a = true;
                break;
            }
        }

        assertTrue(a);
        driver.quit();
    }

    /**
     * 5.5 Нужно написать сквозной тест с использованием Selenium, который
     * авторизует пользователя на
     * сайте https://www.saucedemo.com/.
     * Данные для входа - логин: "standard_user", пароль: "secret_sauce".
     * Проверить, что авторизация прошла успешно и отображаются товары.
     * Вам необходимо использовать WebDriver для открытия страницы и методы
     * sendKeys() для ввода
     * данных в поля формы, и submit() для отправки формы. После этого,
     * проверьте, что на странице
     * отображаются продукты (productsLabel.getText() = "Products").
     */

    @Test
    void checkBrowserSauceDemoTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement swagLabs = driver.findElement(By.cssSelector("div.login_container"));

        WebElement searchUsernames = swagLabs.findElement(By.cssSelector("div.login_credentials"));
        WebElement searchPassword = swagLabs.findElement(By.cssSelector("div.login_password"));
        String usernames = searchUsernames.getText().split("\n")[1];
        String password = searchPassword.getText().split("\n")[1];

        WebElement inputUsername = swagLabs.findElement(By.cssSelector("input#user-name"));
        inputUsername.sendKeys(usernames);

        WebElement inputPassword = swagLabs.findElement(By.cssSelector("input#password"));
        inputPassword.sendKeys(password);

        WebElement buttonLogin = swagLabs.findElement(By.cssSelector("input#login-button"));
        buttonLogin.submit();

//        String url = driver.getCurrentUrl();
//        System.out.println(url);
        WebElement searchProductsLabel = driver.findElement(By.cssSelector("span.title"));
//        System.out.println(searchProductsLabel.getText());

        assertEquals(searchProductsLabel.getText().toString(), "Products");

        driver.quit();
    }
}
