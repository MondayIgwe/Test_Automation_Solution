package Web_Task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import com.studentapp.testbase.TestBase;



public class Execution extends TestBase {

    private final String URL = "http://www.way2automation.com/angularjs-protractor/webtables/";
    private WebDriver driver = null;

  @BeforeTest
  public void setPath(){
      System.setProperty("webdriver.chrome.driver", "selenium/chromedriver_win32/chromedriver.exe");

  }

    @Test
    public void web_Task_2() throws ClassNotFoundException, Exception {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        String print = driver.getTitle();
        System.out.print(print);

        addUsers_FirstUser("Johnny","Johnson","johnny","@admin","Admin","admin@mail.com","0825554657");
        Thread.sleep(2000);

        addUsers_SecondUser("Kingsley","Chucks","kingChu","@customer","Customer","customer@mail.com","0834449856");
        Thread.sleep(2000);

        tearDown_Execution();
    }


    /*
     * Creating custom Methods
     */

    public void addUsers_FirstUser(String FName1, String LName1, String User1, String Pass1, String Admin, String email_Address, String cell_Number) throws Exception{

        //Call add User Function
        addUserBtn();


        WebElement firstName = driver.findElement(By.cssSelector("input[name='FirstName']"));
        firstName.clear();
        firstName.sendKeys(FName1,Keys.TAB);

        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.cssSelector("input[name='LastName']"));
        lastName.clear();
        lastName.sendKeys(LName1, Keys.TAB);

        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.cssSelector("input[name='UserName']"));
        userName.clear();
        userName.sendKeys(User1,Keys.TAB);

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.cssSelector("input[name='Password']"));
        password.clear();
        password.sendKeys(Pass1,Keys.TAB);

        Thread.sleep(1000);

        WebElement radioBtn1_company_AAA= driver.findElement(By.cssSelector("input[value='15']"));
        selectRadioBTN(radioBtn1_company_AAA);

        Thread.sleep(1000);

        WebElement role = driver.findElement(By.cssSelector("select[name='RoleId']"));
        role.click();
        Thread.sleep(1000);
        Select roles = new Select(role);
        roles.selectByVisibleText(Admin);

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//input[@name='Email' and @type='email']"));
        email.clear();
        email.sendKeys(email_Address);

        Thread.sleep(1000);

        WebElement cell = driver.findElement(By.xpath("//input[@name='Mobilephone' and @type='text']"));
        cell.clear();
        cell.sendKeys(cell_Number);


        Thread.sleep(1000);

        WebElement save = driver.findElement(By.cssSelector("button.btn.btn-success"));
        save.click();
        Thread.sleep(2000);

    }

    public void addUsers_SecondUser(String FName2, String LName2, String User2, String Pass2, String Customer, String customer_Email, String cell_Number) throws Exception{

        //Call add User Functions
        addUserBtn();


        WebElement firstName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        firstName.clear();
        firstName.sendKeys(FName2,Keys.TAB);


        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        lastName.clear();
        lastName.sendKeys(LName2, Keys.TAB);

        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        userName.clear();
        userName.sendKeys(User2,Keys.TAB);

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        password.clear();
        password.sendKeys(Pass2,Keys.TAB);

        Thread.sleep(1000);

        WebElement radioBtn2_company_BBB = driver.findElement(By.cssSelector("input[value='16']"));
        selectRadioBTN(radioBtn2_company_BBB);

        Thread.sleep(1000);

        WebElement role = driver.findElement(By.cssSelector("select[name='RoleId']"));
        role.click();
        Thread.sleep(1000);
        Select roles = new Select(role);
        roles.selectByVisibleText(Customer);

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//input[@name='Email' and @type='email']"));
        email.clear();
        email.sendKeys(customer_Email);

        Thread.sleep(1000);

        WebElement cell = driver.findElement(By.xpath("//input[@name='Mobilephone' and @type='text']"));
        cell.clear();
        cell.sendKeys(cell_Number);


        Thread.sleep(1000);

        WebElement save = driver.findElement(By.cssSelector("button.btn.btn-success"));
        save.click();
        Thread.sleep(2000);

    }


    public void highLighterMethod(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public void selectRadioBTN(WebElement radioBtn){
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn);
    }


    public Boolean addUserBtn() throws Exception{
        WebElement assertUser = driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']"));
        highLighterMethod(assertUser);

        //Validate User List Table is Visible
        WebElement userListTable = driver.findElement(By.cssSelector("tr.smart-table-header-row"));
        Assert.assertTrue(userListTable.isDisplayed());
        highLighterMethod(userListTable);

         int waitTime = 2000;
        Thread.sleep(waitTime);
        assertUser.click();
        return true;
    }

    public void tearDown_Execution(){
        try
        {
            driver.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}