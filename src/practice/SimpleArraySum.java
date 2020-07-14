//https://www.hackerrank.com/challenges/simple-array-sum/problem?h_r=profile
package practice;

import java.util.Arrays;

public class SimpleArraySum {

  public static void main(String[] args) {

    int[] ar = new int[]{1, 2, 3, 4, 10, 11};
    System.out.println(simpleArraySum(ar));

  }

  static int simpleArraySum(int[] ar) {
    return Arrays.stream(ar).reduce(0, Integer::sum);
  }

}