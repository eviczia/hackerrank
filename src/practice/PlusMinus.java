// https://www.hackerrank.com/challenges/plus-minus/problem?h_r=profile
package practice;

public class PlusMinus {
  public static void main(String[] args) {

    int[] arr = new int[]{-4, 3, -9, 0, 4, 1};
    plusMinus(arr);

  }

  static void plusMinus(int[] arr) {
    float minusCount = 0;
    float zeroCount = 0;
    float positiveCount = 0;
    for (int n : arr) {
      if (n < 0) {
        minusCount++;
      } else if (n == 0) {
        zeroCount++;
      } else {
        positiveCount++;
      }
    }
    System.out.printf("%.6f\n%.6f\n%.6f", positiveCount / arr.length, minusCount / arr.length, zeroCount / arr.length);
  }

}