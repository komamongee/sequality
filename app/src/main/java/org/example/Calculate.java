package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOdd(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEven(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public double average(int... numbers) {
    if (numbers.length == 0) {
      return 0.0;
    }
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return (double) sum / numbers.length;
  }

  public double averageRange(int start, int end) {
    int sum = sumRange(start, end);
    int count = end - start + 1;
    return (double) sum / count;
  }

  public static void main(String[] args) {
    // 2と3の合計と平均を計算して表示
    int sum2And3 = new Calculate().sum(2, 3);
    double avg2And3 = new Calculate().average(2, 3);
    System.out.println("Sum of 2 and 3 is " + sum2And3 + ". Average is " + avg2And3 + ".");

    // 1から10までの合計と平均を計算して表示
    int sum1To10 = new Calculate().sumRange(1, 10);
    double avg1To10 = new Calculate().averageRange(1, 10);
    System.out.println("Sum of 1 to 10 is " + sum1To10 + ". Average is " + avg1To10 + ".");

    // 1から10までの奇数の合計を計算して表示
    int oddSum = new Calculate().sumOdd(1, 10);
    System.out.println("Sum of odd of 1 to 10 is " + oddSum + ".");

    // 1から10までの偶数の合計を計算して表示
    int evenSum = new Calculate().sumEven(1, 10);
    System.out.println("Sum of even of 1 to 10 is " + evenSum + ".");
  }
}
