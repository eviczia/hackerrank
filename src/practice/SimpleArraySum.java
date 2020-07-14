package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleArraySum {

  public static void main(String[] args) {

    int[] ar = new int[]{1, 2, 3, 4, 10, 11};
    System.out.println(simpleArraySum(ar));

  }

  static int simpleArraySum(int[] ar) {
    return Arrays.stream(ar).reduce(0, Integer::sum);
  }

}