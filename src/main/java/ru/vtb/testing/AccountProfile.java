package ru.vtb.testing;

/*Created by Stanislav Silkov */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.Constants;

public class AccountProfile extends Constants {
    public WebDriver driver;

    public AccountProfile(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonPopolnit = By.xpath("//button[text()=\"Пополнить\"]");
    private final By buttonOplatit = By.xpath("//button[text()=\"Оплатить\"]");
    private final By offers = By.xpath("//button[@data-test-id=\"bankOffers\"]");

    private final By pageInformation = By.xpath("//a[@class=\"SettingsView__StyledLink-sc-dhdr1i-0 kigDdL\"][1]");
    private final By pageSettings = By.xpath("//div[text()=\"Настройки\"]");
    private final By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    private final By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");

    private final By tabDebt = By.xpath("//button[text()=\"Задолженность\"]");

    private final By accMinAmount = By.xpath("//p[text()=\"Минимальный платеж\"]");
    private final By accGrace = By.xpath("//p[text()=\"Беспроцентный период\"]");
    private final By accDebt = By.xpath("//*[@class=\"sc-pIxCL hfpFnr\"]//p[text()=\"Общая задолженность\"]");
    private final By accCredLim = By.xpath("//p[text()=\"Кредитный лимит\"]");
    private final By accTarrifs = By.xpath("//p[text()=\"Тарифы и условия\"]");

    private final By footerButtonDownLoad = By.xpath("//p[text()=\"Сохранить\"]");
    private final By footerButtonSend = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By footerButtonPrint = By.xpath("//p[text()=\"Печать\"]");

    private final By tabRekvizits = By.xpath("//span[text()=\"Реквизиты\"]");
    private final By titleRekvAcc = By.xpath("//span[text()=\"Реквизиты счета • 1662\"]");

    private final By fieldBankName = By.xpath("//span[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//span[text()=\"БИК банка получателя\"]");
    private final By fieldINN = By.xpath("//span[text()=\"ИНН банка получателя\"]");
    private final By fieldKPP = By.xpath("//span[text()=\"КПП банка получателя\"]");
    private final By fieldKS = By.xpath("//span[text()=\"К/С банка получателя\"]");
    private final By fieldCardHolder = By.xpath("//span[text()=\"Получатель\"]");
    private final By fieldAccountNumber = By.xpath("//span[text()=\"Счет получателя в банке получателя\"]");
    private final By titleRekvCard = By.xpath("//span[text()=\"Реквизиты карты • 1732\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//span[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//span[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//span[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//span[text()=\"Статус карты\"]");

    private final By calendar = By.xpath("//button[@data-test-id=\"openSection\"]");
    private final By buttonMore = By.xpath("//*[text()=\"Еще\"]");
    private final By buttonHowUseCard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    private final By buttonGiveAndPay = By.xpath("//*[text()=\"Перевести и Оплатить\"]");
    private final By buttonTabDebt = By.xpath("//*[text()=\"Задолженность\"]");
    private final By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    private final By buttonTurnCreHoliday = By.xpath("//*[text()=\"Подключить кредитные каникулы\"]");
    private final By buttonMakeDoc = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonNotPayPercent = By.xpath("//*[text()=\"Ваш беспроцентный период\"]");
    private final By buttonAddCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");


    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncProfileAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/49B52C03CF974B0887745E1C2C462330");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncProfileAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/49B52C03CF974B0887745E1C2C462330");
        Thread.sleep(2000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkButtonOplatit() {
        driver.findElement(buttonOplatit).isDisplayed();
    }


    public void pageInformation() {
        driver.findElement(pageInformation).isDisplayed();
    }

    public void pageSettings() {
        driver.findElement(pageSettings).isDisplayed();
    }

    public void pageHistoryOperation() {
        driver.findElement(pageHistoryOperation).isDisplayed();
    }

    public void pageRassrochki() {
        driver.findElement(pageRassrochki).isDisplayed();
    }

    public void clickTabDebt() {
        driver.findElement(tabDebt).isDisplayed();
    }

    public void checkAccGrace() {
        driver.findElement(accGrace).click();
    }

    public void checkAccDebt() {
        driver.findElement(accDebt).click();
    }

    public void checkAccCredLim() {
        driver.findElement(accCredLim).click();
    }

    public void checkAccTarrifs() throws InterruptedException {
        driver.findElement(accTarrifs).click();
        Thread.sleep(2000);
    }

    public void checkButtonDownLoad() {
        driver.findElement(footerButtonDownLoad).isDisplayed();
    }

    public void checkButtonSend() {
        driver.findElement(footerButtonSend).isDisplayed();
    }

    public void checkButtonPrint() {
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void clickTabRequisites() {
        driver.findElement(tabRekvizits).click();
    }

    public void checkFieldsTabsRequisites() {
        driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        driver.findElement(titleRekvCard).isEnabled();
        driver.findElement(fieldName).isEnabled();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void checkButtonsRequis() {
        driver.findElement(footerButtonDownLoad).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void checkCalendar() {
        driver.findElement(calendar).click();
    }

}
