/*Created by Stanislav Silkov */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.AccountProfile;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Счёт Profile")
public class AccountProfileTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.Authorization2();
    }


    @Test
    @Order(3)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonPopolnit();
    }

    @Test
    @Order(4)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonOplatit();
    }

    @Test
    @Order(5)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageInformation();
    }


    @Test
    @Order(6)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageSettings();
    }

    @Test
    @Order(7)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageHistoryOperation();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageRassrochki();
    }

    @Order(9)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.clickTabDebt();
    }

    @Order(11)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccGrace();
    }

    @Order(12)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccDebt();
    }


    @Order(13)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccCredLim();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccTarrifs();
    }

    @Order(15)
    @Test
    @DisplayName("Наличие в подвале кнопки Скачать")
    public void checkButtonDownLoad() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonDownLoad();
    }

    @Order(16)
    @Test
    @DisplayName("Наличие в подвале кнопки Отправить на емэйл")
    public void checkButtonSend() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonSend();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие в подвале кнопки Печать")
    public void checkButtonPrint() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonPrint();
    }

    @AfterAll
    @Test
    public static void quit() {
        driver.quit();
    }
}
