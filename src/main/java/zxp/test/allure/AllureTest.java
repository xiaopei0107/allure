package zxp.test.allure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class AllureTest {
  @Test
  public void test1() {
	  assertEquals("xp", "xp");
  }
  @Test
  public void test2() {
	  assertEquals("xp", "xp");
  }
  @Test
  public void test3() {
	  assertEquals(1, 2);
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
