// https://www.hackerrank.com/challenges/circular-array-rotation/problem
package practice;

import java.util.Arrays;

public class CircularArrayRotation {
  public static void main(String[] args) {

    int[] a = new int[]{1, 2, 3};
    int k = 2;
    int[] queries = new int[]{0, 1, 2};

    System.out.println(Arrays.toString(circularArrayRotation(a, k, queries)));

  }

  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    k = k % a.length;
    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int m = queries[i] - k + ((queries[i] - k < 0) ? a.length : 0);
      result[i] = a[m];
    }
    return result;
  }

}
