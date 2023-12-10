package ru.vtb.testing;

/*Created by Stanislav Silkov */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.Constants;

public class CardProfile extends Constants {
    public WebDriver driver;

    public CardProfile(WebDriver driver) {
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
    private final By titleRekvAcc = By.xpath("//span[text()=\"Реквизиты счета • 1662\"]");
    private final By fieldBankName = By.xpath("//div[text()=\"Филиал № 7701 Банка ВТБ (ПАО)\"]");
    private final By fieldBIK = By.xpath("//*[text()=\"044525745\"]");
    private final By fieldINN = By.xpath("//*[text()=\"7702070139\"]");
    private final By fieldKPP = By.xpath("//*[text()=\"770943003\"]");
    private final By fieldKS = By.xpath("//*[text()=\"30101810345250000745\"]");
    private final By fieldCardHolder = By.xpath("//*[text()=\"Кудрявцев Аким Эдуардович\"]");
    private final By fieldAccountNumber= By.xpath("//*[text()=\"40817810200006001662\"]");
    private final By titleRekvCard = By.xpath("//span[text()=\"Реквизиты карты • 1732\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//*[text()=\"2200 24** **** 1732 \"]");
    private final By fieldData = By.xpath("//*[text()=\"31.01.2030\"]");
    private final By fieldOwner = By.xpath("//*[text()=\"NPSIY NPSNOV\"]");
    private final By fieldStatus = By.xpath("//*[text()=\"Карта активна\"]");

    private final By footerButtonShowNumber = By.xpath("//p[text()=\"Показать номер карты\"]");
    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");
    private final By buttonHowUseCard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    private final By buttonGiveAndPay = By.xpath("//*[text()=\"Перевести и Оплатить\"]");
    private final By buttonChangePinCode = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    private final By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    private final By buttonTabDebt = By.xpath("//*[text()=\"Задолженность\"]");
    private final By buttonShowCardNumber = By.xpath("//*[text()=\"Показать номер карты\"]");
    private final By buttonOrderCertificate = By.xpath("//*[text()=\"Заказать справку\"]");
    private final By buttonMakeDocument = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonNotPayPercent = By.xpath("//*[text()=\"Ваш беспроцентный период\"]");

    private final By pagePercentHeader = By.xpath("//h2[@id=\"header\"]");
    private final By pagePercentAcc1 = By.xpath("//p[text()=\"Если платеж в праздничный или выходной день?\"]");
    //private final By acc1 = By.xpath("//p[text()=\"Дата платежа переносится на следующий рабочий день\"]");
    private final By pagePercentAcc2 = By.xpath("//p[text()=\"Что будет, если не оплатить?\"]");
    private final By pagePercentAcc3 = By.xpath("//p[text()=\"Как обновить беспроцентный период?\"]");
    private final By pagePercentAcc4 = By.xpath("//p[text()=\"Какие операции входят в беспроцентный период?\"]");
    private final By pagePercentAcc5 = By.xpath("//p[text()=\"Как я узнаю, что надо платить?\"]");
    private final By pagePercentAcc6 = By.xpath("//p[text()=\"Почему начислились проценты?\"]");

    private final By buttonRename = By.xpath("//h3[@class=\"sc-fzpkqZ kPMgag sc-qXHHN gKjPiB\"]");
    private final By buttonSave = By.xpath("//button[@title=\"Сохранить\"]");
    private final By buttonCancel = By.xpath("//button[@title=\"Отменить\"]");

    private final By input1 = By.xpath("//input[@label=\"Владелец\"]");
    private final By input2 = By.xpath("//input[@label=\"CVV\"]");
    private final By input3 = By.xpath("//input[@label=\"Действует до\"]");
    private final By input4 = By.xpath("//input[@label=\"Номер карты\"]");

    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncProfileCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/A0EFB6E5698841E6966C63BF64CB672B");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncProfileCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/A0EFB6E5698841E6966C63BF64CB672B");
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
    public void checkTabRekv(){
        driver.findElement(tabRekvizits).click();

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

    public void pressButtonsMore() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(buttonMore).click();
    }

    public void checkButtonsMenuMore(){
        driver.findElement(buttonGiveAndPay).isDisplayed();
        driver.findElement(buttonChangePinCode).isDisplayed();
        driver.findElement(buttonBlock).isDisplayed();
        driver.findElement(buttonTabDebt).isDisplayed();
        driver.findElement(buttonOrderCertificate).isDisplayed();
        driver.findElement(buttonShowCardNumber).isDisplayed();
        driver.findElement(buttonMakeDocument).isDisplayed();
        driver.findElement(buttonNotPayPercent).isDisplayed();
        driver.findElement(buttonHowUseCard).isDisplayed();
    }

    public void clickButtonNotPayPercent(){
        driver.findElement(buttonNotPayPercent).click();
    }

    public void checkFieldsButtonNotPayPercent() throws InterruptedException {
        driver.findElement(pagePercentHeader).isDisplayed();
        driver.findElement(pagePercentAcc1).click();
        Thread.sleep(1000);
        driver.findElement(pagePercentAcc2).click();
        Thread.sleep(1000);
        driver.findElement(pagePercentAcc3).click();
        Thread.sleep(1000);
        driver.findElement(pagePercentAcc4).click();
        Thread.sleep(3000);
        driver.findElement(pagePercentAcc5).click();
        Thread.sleep(1000);
        driver.findElement(pagePercentAcc6).click();
        Thread.sleep(1000);
    }

    public void returnMainPage(){
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/858E4ED23FF84146BB01DD52D06DF6CD");
    }

    public void checkRename() throws InterruptedException {
        driver.findElement(buttonRename).click();
        Thread.sleep(2000);
    }

    public void checkButtonRenameAndCloseRename() throws InterruptedException {
        driver.findElement(buttonSave).isDisplayed();
        driver.findElement(buttonCancel).isDisplayed();
        driver.findElement(buttonCancel).click();
        Thread.sleep(2000);
    }

    public void openMenuMore(){
        driver.findElement(buttonMore).click();
    }

    public void clickShowCardNumber(){
    driver.findElement(buttonShowCardNumber).click();
    }

    public void checkPageShowCardNumber(){
        driver.findElement(input1).isDisplayed();
        driver.findElement(input2).isDisplayed();
        driver.findElement(input3).isDisplayed();
        driver.findElement(input4).isDisplayed();

    }

}
