//https://www.hackerrank.com/challenges/equality-in-a-array/problem
package practice;

import java.util.HashMap;
import java.util.Map;

public class EqualizeArray {

  public static void main(String[] args) {

    int[] arr = new int[]{3, 3, 2, 1, 3};

    System.out.println(equalizeArray(arr));

  }

  static int equalizeArray(int[] arr) {
    int maxCount = 0;
    Map<Integer, Integer> intCounts = new HashMap<>();
    for (int n : arr) {
      if (intCounts.containsKey(n)) {
        intCounts.replace(n, intCounts.get(n) + 1);
      } else {
        intCounts.put(n, 1);
      }
      maxCount = Math.max(maxCount, intCounts.get(n));
    }
    return arr.length - maxCount;
  }

}