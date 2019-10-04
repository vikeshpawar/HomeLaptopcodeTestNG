package TestSelenium.TestSelenium;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" IN @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" IN @AfterMethod");

  }


  @BeforeClass
  public void beforeClass() {	 
	  System.out.println(" IN @@BeforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" IN @@AfterClass");
 }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" IN @@BeforeTest");
 }

  @AfterTest
  public void afterTest() {
	  System.out.println(" IN @@AfterTest");
}

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" IN @@BeforeSuite");
}

  @AfterSuite
  public void afterSuite() {
	System.out.println(" IN @@AfterSuite my");
 }

}
