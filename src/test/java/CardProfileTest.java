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
import ru.vtb.testing.CardProfile;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Profile")
public class CardProfileTest extends BaseTest {

    private static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.Authorization2();
    }

    @Test
    @Order(3)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonPopolnit();
    }

    @Test
    @Order(4)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonOplatit();
    }

    @Test
    @Order(5)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageInformation();
    }


    @Test
    @Order(6)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageSettings();
    }

    @Test
    @Order(7)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageHistoryOperation();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageRassrochki();
    }

    @Order(9)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.clickTabDebt();
    }

    @Order(11)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccGrace();
    }

    @Order(12)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccDebt();
    }


    @Order(13)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccCredLim();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccTarrifs();
    }
    @Order(15)
    @Test
    @DisplayName("Наличие в подвале кнопки Скачать")
    public void checkButtonDownLoad() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonDownLoad();
    }

    @Order(16)
    @Test
    @DisplayName("Наличие в подвале кнопки Отправить на емэйл")
    public void checkButtonSend() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonSend();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие в подвале кнопки Печать")
    public void checkButtonPrint() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonPrint();
    }

    @AfterAll
    @Test
    public static void quit(){
        driver.quit();
    }
}

