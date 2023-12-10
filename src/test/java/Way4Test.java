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
import ru.vtb.testing.Way4;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Openway")
public class Way4Test extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.Authorization2();
    }

    @Test
    @Order(3)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonPopolnit();
    }

    @Test
    @Order(4)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonOplatit();
    }

    @Test
    @Order(5)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        Way4 way4 = new Way4(driver);
        way4.pageInformation();
    }


    @Test
    @Order(6)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        Way4 way4 = new Way4(driver);
        way4.pageSettings();
    }

    @Test
    @Order(7)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        Way4 way4 = new Way4(driver);
        way4.pageHistoryOperation();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageHowUseCard() {
        Way4 way4 = new Way4(driver);
        way4.pageHowUseCard();
    }

    @Order(9)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        Way4 way4 = new Way4(driver);
        way4.clickTabDebt();
    }

    @Order(11)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        Way4 way4 = new Way4(driver);
        way4.checkAccGrace();
    }

    @Order(12)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        Way4 way4 = new Way4(driver);
        way4.checkAccDebt();
    }


    @Order(13)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        Way4 way4 = new Way4(driver);
        way4.checkAccCredLim();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.checkAccTarrifs();
    }
    @Order(15)
    @Test
    @DisplayName("Наличие в подвале кнопки Скачать")
    public void checkButtonDownLoad() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonDownLoad();
    }

    @Order(16)
    @Test
    @DisplayName("Наличие в подвале кнопки Отправить на емэйл")
    public void checkButtonSend() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonSend();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие в подвале кнопки Печать")
    public void checkButtonPrint() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonPrint();
    }

    @AfterAll
    @Test
    public static void quit(){
        driver.quit();
    }
}

