package org.example.stepdefs;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class loginpage {

    WebDriver ldriver;

    public loginpage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);


    }

    @FindBy(id = "user-name")
    WebElement Email;

    public String ADD_ANOTHTER_EMAIL = "user-name";

    @FindBy(id = "password")
    WebElement Password;

    public String ADD_ANOTHTER_PASSWORD = "password";
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement LoginBtn;

    @FindBy(xpath = "//a[@class='form__forgot-password']")
    WebElement Forgotbtn;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement Addcartbtn;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElement cartbtn;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement selectdropdown;

//    WebElement dropd = ldriver.findElement(By.xpath("//select[@class='product_sort_container']"));

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement selectvalue;

    public static String ADD_ANOTHTER_CART = "//button[@data-test='add-to-cart-sauce-labs-bike-light']";

    public static String REMOVER_CART_ITEM = "//button[@data-test='remove-sauce-labs-backpack']";

    @FindBy(xpath = "//button[.='Checkout']")
    WebElement checkoutcart;

    public static String ADD_FANME = "//input[@data-test='firstName']";
    public static String MY_XPATH = "//button[text()='Add to cart']";

    public static String ADD_LANME = "//input[@data-test='lastName']";
    public static String ADD_PCODE = "//input[@data-test='postalCode']";

    public static String CLICK_CONT = "//input[@class='submit-button btn btn_primary cart_button btn_action']";

    public static String CLICK_FNS = "//button[.='Finish']";

    @FindBy(xpath = "//a[.='Logout']")
    WebElement logoutbtn;

    public static String CLICK_MENU = "//button[.='Open Menu']";

    public static String CHECK_TOAST = "//span[@class='shopping_cart_badge']";

    public static String CHECK_BATCH = "//a[@class='shopping_cart_link']";

    public void enterEmail(String emailadd) {
        Email.sendKeys(emailadd);

    }

    public void enterPassword(String pwd) {
        Password.sendKeys(pwd);

    }

    public void ClickLoginButton() throws InterruptedException {
        LoginBtn.click();
//        Thread.sleep(20000);
    }

    public void Clickfogotbutton() {
        Forgotbtn.click();
    }

    public void Clickaddcartbtn() throws InterruptedException {
        Addcartbtn.click();
    }

    public void Clickcartbtn() throws InterruptedException {
        cartbtn.click();
    }

    public void setselectdrop() {
        selectdropdown.click();

    }

    public void setselectvalue() {
        Select Dropdown = new Select(selectvalue);
        Dropdown.selectByIndex(2);
    }

    public void verifyproductprice() {

        String Vtext = ldriver.findElement(By.xpath("//div[.='$29.99']")).getText();
    }

    public void addanothercart() {
        ldriver.findElement(By.xpath(ADD_ANOTHTER_CART)).click();
    }

    public void removecart() {
        ldriver.findElement(By.xpath(REMOVER_CART_ITEM)).click();
    }

    public void chkoutbtn() {
        checkoutcart.click();
    }

    public void addfname() {
        ldriver.findElement(By.xpath(ADD_FANME)).sendKeys("Afshain");
    }

    public void addLname() {
        ldriver.findElement(By.xpath(ADD_LANME)).sendKeys("Mukhtar");

    }

    public void addPcode() {
        ldriver.findElement(By.xpath(ADD_PCODE)).sendKeys("987456");

    }

    public void clickcont() {
        ldriver.findElement(By.xpath(CLICK_CONT)).click();

    }

    public void clickfns() {
        ldriver.findElement(By.xpath(CLICK_FNS)).click();

    }

    public void setThnkmsg() {
        String msgdisplayed = ldriver.findElement(By.xpath("//h2[.='Thank you for your order!']")).getText();
        System.out.println(msgdisplayed);
//        Assert.assertEquals(msgdisplayed,true);
        try {
            if (msgdisplayed != null) {
                Assert.assertEquals(msgdisplayed, "Thank you for your order!");
//        Assert.assertTrue(msgdisplayed,"The message not showing");
                System.out.println("Message is Displayed");
            }
        } catch (Exception e) {
            System.out.println("Message is not Displayed");
        }

    }

    public void setLoginBtn() {
        logoutbtn.click();
    }

    public void logoutlinkchk() {
        String geturllogout = ldriver.getCurrentUrl();
        Assert.assertEquals(geturllogout, "https://www.saucedemo.com/");
        System.out.println(geturllogout);
    }

    public void setClickMenu() {
        ldriver.findElement(By.xpath(CLICK_MENU)).click();
    }

    public void chktoast() {
        String checktoast = ldriver.findElement(By.xpath(CHECK_TOAST)).getText();
//        Assert.assertEquals(checktoast,"2");
        if (checktoast != null) {
            System.out.println("Your toast value is  " + checktoast);
        } else {
            System.out.println("You have not selected any item");
        }

    }

    public void batchempty() {
        String element = ldriver.findElement(By.xpath(CHECK_BATCH)).getText();
//        boolean checkbatch= element.isDisplayed();
//        Assert.assertEquals(checkbatch,"//div[contains(@class,'shopping_cart_container')]");
//        System.out.println("Loctor"+ checkbatch);

        if (element != null) {
            System.out.println("Your toast value is  " + element);
        } else {
            System.out.println("You have not selected any item");
        }

    }

    public void getdata() throws IOException {
        File myexcel = new File("D:\\PIP\\src\\test\\Excel\\Book1.xlsx");
        FileInputStream file;
        file = new FileInputStream(myexcel);
        XSSFWorkbook workb = new XSSFWorkbook(file);
        XSSFSheet sheet = workb.getSheetAt(0);
        String entry1 = sheet.getRow(1).getCell(0).getStringCellValue();
        String entry2 = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(entry1);
        System.out.println(entry2);
        Email.sendKeys(entry1);
        Password.sendKeys(entry2);
    }

    public void batchempty1() {
        List<WebElement> myElements;

        myElements = ldriver.findElements(By.xpath(MY_XPATH));

        for (int i = 0; i < myElements.size(); i++) {
            myElements.get(i).click();
        }

    }


}
