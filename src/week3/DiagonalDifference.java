//https://www.hackerrank.com/challenges/diagonal-difference/problem
package week3;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

  public static void main(String[] args) {
    List<List<Integer>> arr1 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9));
    List<List<Integer>> arr2 = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));

    System.out.println(diagonalDifference(arr1));
    System.out.println(diagonalDifference(arr2));

  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int dd = 0;
    for (int i = 0; i < arr.size(); i++) {
      List<Integer> currentLine = arr.get(i);
      dd += currentLine.get(i) - currentLine.get(currentLine.size() - i - 1);
    }
    return Math.abs(dd);
  }
}


