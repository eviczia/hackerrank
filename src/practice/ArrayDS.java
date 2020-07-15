//https://www.hackerrank.com/challenges/arrays-ds/problem
package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDS {
  public static void main(String[] args) {

    int[] a = new int[]{1, 4, 3, 2};

    System.out.println(Arrays.toString(reverseArray(a)));

  }

  private static int[] reverseArray(int[] a) {
    return IntStream.range(0, a.length).map(i -> a[a.length - i - 1]).toArray();
  }


}
