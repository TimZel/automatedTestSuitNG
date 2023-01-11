import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class automatedTests {
    @Test
    public void  authorisationTest() throws InterruptedException { //позитивная проверка авторизации
        //могут быть негативные:
        // -без почты и пароля; -без почты; -без пароля; - некорректные юзер и пароль; - неверный юзер; - неверный пароль.
        System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/zelyanin/Desktop/qa-test.html");

        WebElement loginEmail = driver.findElement(By.id("loginEmail"));
        WebElement loginPassword = driver.findElement(By.id("loginPassword"));
        WebElement enterButton = driver.findElement(By.id("authButton"));

        loginEmail.sendKeys("test@protei.ru");
        loginPassword.sendKeys("test");
        Thread.sleep(3000);
        enterButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public static void  formTest1() throws InterruptedException { //негативный тест добавления информации при 1 незаполненном поле
        System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/zelyanin/Desktop/qa-test.html");

        WebElement loginEmail = driver.findElement(By.id("loginEmail"));
        WebElement loginPassword = driver.findElement(By.id("loginPassword"));
        WebElement enterButton = driver.findElement(By.id("authButton"));

        loginEmail.sendKeys("test@protei.ru");
        loginPassword.sendKeys("test");
        enterButton.click();

        WebElement formAddLoginEmail = driver.findElement(By.id("dataEmail"));
        WebElement formAddButton = driver.findElement(By.id("dataSend"));

        formAddLoginEmail.sendKeys("test@protei.ru");
        formAddButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public static void  formTest2() throws InterruptedException { //позитивный тест добавления информация при 2х обязательных полях
        System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/zelyanin/Desktop/qa-test.html");

        WebElement loginEmail = driver.findElement(By.id("loginEmail"));
        WebElement loginPassword = driver.findElement(By.id("loginPassword"));
        WebElement enterButton = driver.findElement(By.id("authButton"));

        loginEmail.sendKeys("test@protei.ru");
        loginPassword.sendKeys("test");
        enterButton.click();

        WebElement formAddLoginEmail = driver.findElement(By.id("dataEmail"));
        WebElement formAddName= driver.findElement(By.id("dataName"));
        WebElement formAddButton = driver.findElement(By.id("dataSend"));

        formAddLoginEmail.sendKeys("test@protei.ru");
        formAddName.sendKeys("Smitty");
        formAddButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public static void  formTest3() throws InterruptedException { //позитивный тест добавления информация
        // при 2х обязательных полях и выборе пола не по умолчанию
        System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/zelyanin/Desktop/qa-test.html");

        WebElement loginEmail = driver.findElement(By.id("loginEmail"));
        WebElement loginPassword = driver.findElement(By.id("loginPassword"));
        WebElement enterButton = driver.findElement(By.id("authButton"));

        loginEmail.sendKeys("test@protei.ru");
        loginPassword.sendKeys("test");
        enterButton.click();

        WebElement formAddLoginEmail = driver.findElement(By.id("dataEmail"));
        WebElement formAddName= driver.findElement(By.id("dataName"));
        WebElement formChooseGender= driver.findElement(By.id("dataGender"));
        WebElement formListElementWoman = driver.findElement(By.xpath("//option[text()='Женский']")); //Элемент меню из списка
        WebElement formAddButton = driver.findElement(By.id("dataSend"));

        formAddLoginEmail.sendKeys("test@protei.ru");
        formAddName.sendKeys("Smitty");
        formChooseGender.click();
        formListElementWoman.click();
        formAddButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public static void  formTest4() throws InterruptedException { //позитивный тест добавления информация
        // при 2х обязательных полях, выборе пола, полном сете чекбоксов и выбранном радиобаттоне
        System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/zelyanin/Desktop/qa-test.html");

        WebElement loginEmail = driver.findElement(By.id("loginEmail"));
        WebElement loginPassword = driver.findElement(By.id("loginPassword"));
        WebElement enterButton = driver.findElement(By.id("authButton"));

        loginEmail.sendKeys("test@protei.ru");
        loginPassword.sendKeys("test");
        enterButton.click();

        WebElement formAddLoginEmail = driver.findElement(By.id("dataEmail"));
        WebElement formAddName= driver.findElement(By.id("dataName"));
        WebElement formChooseGender= driver.findElement(By.id("dataGender"));
        WebElement formListElementMan = driver.findElement(By.xpath("//option[text()='Мужской']")); //Элемент меню из списка
        WebElement formCheckboxVariant11= driver.findElement(By.id("dataCheck11"));
        WebElement formCheckboxVariant12= driver.findElement(By.id("dataCheck12"));
        WebElement formRadiobuttonVariant21= driver.findElement(By.id("dataSelect21"));
        WebElement formAddButton = driver.findElement(By.id("dataSend"));

        formAddLoginEmail.sendKeys("test@protei.ru");
        formAddName.sendKeys("Smitty");
        formChooseGender.click();
        formListElementMan.click();
        formCheckboxVariant11.click();
        formCheckboxVariant12.click();
        formRadiobuttonVariant21.click();
        formAddButton.click();

        Thread.sleep(3000);
        driver.quit();
    }

}
