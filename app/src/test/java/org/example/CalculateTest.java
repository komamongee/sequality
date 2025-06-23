package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumRange() {
    Calculate calculate = new Calculate();
    // 1から10までの合計をテスト
    assertEquals(55, calculate.sumRange(1, 10));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0);
  }

  @Test
  public void testAverageRange() {
    Calculate calculate = new Calculate();
    // 1から10までの平均をテスト
    assertEquals(5.5, calculate.averageRange(1, 10), 0);
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    // 1から10までの奇数の合計をテスト
    assertEquals(25, calculate.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    // 1から10までの偶数の合計をテスト
    assertEquals(30, calculate.sumEven(1, 10));
  }
}
