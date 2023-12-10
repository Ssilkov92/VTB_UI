/*Created by Stanislav Silkov */

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.Vkl;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("ВКЛ")
public class VKLTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void first() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Order(1)
    @Test
    @DisplayName("Авторизация")
    public void enterLoginAndSmsCode() throws InterruptedException {
        Vkl Vkl = new Vkl(driver);
        Vkl.Authorization2();
    }

    /*@Order(2)
    @Test
    @DisplayName("Ввод смс-кода")
    public void enterPassword() throws InterruptedException {
        Vkl Vkl = new Vkl(driver);
        Vkl.enterPassword();
    }*/

    @Test
    @DisplayName("Наличие вкладки \"История операций\"")
    @Order(3)
    public void checkTabHistory() throws InterruptedException {
        Thread.sleep(4000);
        WebElement asss = driver.findElement(By.xpath("//button[@id=\"HISTORY\"]"));
        Assertions.assertTrue(asss.getText().equals("История операций"));
    }

    @Test
    @DisplayName("Наличие кнопки скачивания выписки")
    @Order(4)
    public void checkButtonDownload() {
        Vkl Vkl = new Vkl(driver);
        Vkl.checkButtonDownload();
    }
    @Test
    @DisplayName("Нажатие вкладки Информация")
    @Order(5)
    public void clickTabInformation() {
        Vkl Vkl = new Vkl(driver);
        Vkl.clickTabInformation();
    }

    @Test
    @DisplayName("Проверка полей во вкладке Информация")
    @Order(6)
    public void checkFieldTabInformation() {
        Vkl Vkl = new Vkl(driver);
        Vkl.checkFieldTabInformation();
    }

    @Test
    @DisplayName("Наличие кнопки Отправить по емэйл в подвале")
    @Order(7)
    public void checkButtonSendOnEmail() {
        Vkl Vkl = new Vkl(driver);
        Vkl.checkButtonSendOnEmail();
    }

    @Test
    @DisplayName("Наличие кнопки Сохаранить в подвале")
    @Order(8)
    public void checkButtonDownloadinFooter() {
        Vkl Vkl = new Vkl(driver);
        Vkl.checkDownloadReport();
    }

    @Test
    @DisplayName("Наличие кнопки Печать по емэйл в подвале")
    @Order(9)
    public void checkButtonPechat() {
        Vkl Vkl = new Vkl(driver);
        Vkl.checkButtonPechat();
    }

    @AfterAll
    @Test
    public static void quit(){
        driver.quit();
    }
//    @Test
//    @DisplayName("Проверка кнопки Получить Транш")
//    @Order(7)
//    public void m() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonHaveTransh();
//    }
//
//    @Test
//    @DisplayName("Нажитие кнопки \"Ещё\"")
//    @Order(8)
//    public void n() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickButtonMore();
//    }
//
//    @Test
//    @DisplayName("Наличие кнопки \"Пополнить\"")
//    @Order(9)
//    public void o() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonPopolnit();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Закрыть кредитную линию\"")
//    @Order(10)
//    public void p() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonCloseVKL();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Сформировать выписку\"")
//    @Order(11)
//    public void r() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkMakeDocument();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Подтвердить\" в сценарии закрытия")
//    @Order(12)
//    public void s() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickButtonCloseDocument();
//    }
//
//    @Test
//    @DisplayName("Проверка уведомления о 10 днях в сценарии закрытия")
//    @Order(13)
//    public void t() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkWarning();
//    }
//
//    @Test
//    @DisplayName("Проверка выпадающего списка в сценарии закрытия")
//    @Order(14)
//    public void u() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickListClose();
//    }
//
//    @Test
//    @DisplayName("Проверка наличия причины в выпадающем списке в сценарии закрытия")
//    @Order(15)
//    public void w() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkReason();
//    }
}
