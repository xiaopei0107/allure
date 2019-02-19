package zxp.test.allure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class ReportTest {
  @Test
  public void f() {
	  assertEquals("xpdds", "xpd");
  }
  @Test
  public void f2() {
	  assertEquals("xpdds", "xpdds");
  }
  @Test
  public void f3() {
	  assertEquals("xpdds", "xpdds");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
