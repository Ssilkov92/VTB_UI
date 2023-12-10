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
import ru.vtb.testing.OpenwayVTBAccount;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Cчёт Openway_VTB")
public class OpenwayVTBAccountTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.Authorization2();
    }


    @Test
    @Order(3)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonPopolnit();
    }

    @Test
    @Order(4)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonOplatit();
    }

    @Test
    @Order(5)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageInformation();
    }


    @Test
    @Order(6)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageSettings();
    }

    @Test
    @Order(7)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageHistoryOperation();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageRassrochki();
    }

    @Order(9)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.clickTabDebt();
    }

    @Order(11)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccGrace();
    }

    @Order(12)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccDebt();
    }


    @Order(13)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccCredLim();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccTarrifs();
    }
    @Order(15)
    @Test
    @DisplayName("Наличие в подвале кнопки Скачать")
    public void checkButtonDownLoad() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonDownLoad();
    }

    @Order(16)
    @Test
    @DisplayName("Наличие в подвале кнопки Отправить на емэйл")
    public void checkButtonSend() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonSend();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие в подвале кнопки Печать")
    public void checkButtonPrint() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonPrint();
    }

    @AfterAll
    @Test
    public static void quit(){
        driver.quit();
    }
}


