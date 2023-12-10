package ru.vtb.testing;

/*Created by Stanislav Silkov */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.Constants;

public class OpenwayVTBCard extends Constants {
    public WebDriver driver;

    public OpenwayVTBCard(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonPopolnit = By.xpath("//button[text()=\"Пополнить\"]");
    private final By buttonOplatit = By.xpath("//button[text()=\"Оплатить\"]");
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
    private final By titleRekvAcc = By.xpath("//span[text()=\"Реквизиты счета • 1806\"]");
    private final By fieldBankName = By.xpath("//span[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//*[text()=\"044525745\"]");
    private final By fieldINN = By.xpath("//*[text()=\"7702070139\"]");
    private final By fieldKPP = By.xpath("//*[text()=\"770943003\"]");
    private final By fieldKS = By.xpath("//*[text()=\"30101810345250000745\"]");
    private final By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
    private final By fieldAccountNumber= By.xpath("//*[text()=\"Счет получателя в банке получателя\"]");
    private final By titleRekvCard = By.xpath("//span[text()=\"Реквизиты карты • 4876\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//*[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//*[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//*[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//*[text()=\"Статус карты\"]");

    private final By footerButtonShowNumber = By.xpath("//p[text()=\"Показать номер карты\"]");


    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");

    private final By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    private final By input1 = By.xpath("//*[@type=\"password\"]");
    private final By input2 = By.xpath("//input[2]");
    private final By input3 = By.xpath("//input[3]");
    private final By input4 = By.xpath("//input[4]");

    private final By buttonContinue = By.xpath("//*[text()=\"Продолжить\"]");

    private final By inputSmsCod = By.xpath("//input[@label=\"Введите код из СМС / Push\"]");

    private final By checkSuccess = By.xpath("//h2[text()=\"ПИН-код по карте *4876 изменен\"]");


    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncOpenWayAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/B1D333CCCC0642C1B11BCE1F696F8D0A");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncOpenWayCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/2163ED045FB24661B41C20397F527EAB");
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

    public void checkAccMinAmount() {
        driver.findElement(accMinAmount).click();
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

    public void clickTabReqv(){
        driver.findElement(tabRekvizits).click();
    }

    public void checkTabRekv(){
        driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        driver.findElement(titleRekvCard).isDisplayed();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void checkButtonsRekv() throws InterruptedException {
        driver.findElement(footerButtonDownLoad).isDisplayed();
        driver.findElement(footerButtonShowNumber).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
        Thread.sleep(2000);
    }

    public void pressButtonMore(){
        driver.navigate().refresh();
        driver.findElement(buttonMore).click();
    }


    public void clickChangePin(){
        driver.findElement(buttonChangePin).click();
    }

    public void enterPinCod() throws InterruptedException {
        driver.findElement(input1).sendKeys("6");
        driver.findElement(input2).sendKeys("8");
        driver.findElement(input3).sendKeys("5");
        driver.findElement(input4).sendKeys("7");

        Thread.sleep(3000);
        driver.findElement(buttonContinue).click();
        Thread.sleep(3000);
        driver.findElement(inputSmsCod).sendKeys(codeEpa);
    }

    public void checkSuccessPinCode(){
        driver.findElement(checkSuccess).isDisplayed();
    }
}