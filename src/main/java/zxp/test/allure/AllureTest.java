package zxp.test.allure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class AllureTest {
  @Test
  public void test1() {
	  assertEquals("xp", "xp");
	  System.out.println("测试成功");
  }
  @Test
  public void test2() {
	  assertEquals("xp", "xp");
  }
  @Test
  public void test3() {
	  assertEquals(1, 2);
	  System.out.println("测试失败");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("测试begin");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("测试end");
  }

}
