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
  void testSumRange() {
    Calculate calculate = new Calculate();
    // 1から10までの合計をテスト
    assertEquals(55, calculate.sumRange(1, 10));
  }

  @Test
  void testAverage() {
    Calculate calculate = new Calculate();
    // 2と3の平均をテスト
    assertEquals(2.5, calculate.average(2, 3));
  }

  @Test
  void testAverageRange() {
    Calculate calculate = new Calculate();
    // 1から10までの平均をテスト
    assertEquals(5.5, calculate.averageRange(1, 10));
  }

  @Test
  void testSumOdd() {
    Calculate calculate = new Calculate();
    // 1から10までの奇数の合計をテスト
    assertEquals(25, calculate.sumOdd(1, 10));
  }

  @Test
  void testSumEven() {
    Calculate calculate = new Calculate();
    // 1から10までの偶数の合計をテスト
    assertEquals(30, calculate.sumEven(1, 10));
  }
}
