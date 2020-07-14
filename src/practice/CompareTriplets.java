//https://www.hackerrank.com/challenges/compare-the-triplets/problem
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
  public static void main(String[] args) {

    List<Integer> a = new ArrayList<>(Arrays.asList(17, 28, 30));
    List<Integer> b = new ArrayList<>(Arrays.asList(99, 16, 8));

    System.out.println(compareTriplets(a, b));

  }

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> solution = new ArrayList<>();
    int alicePoints = 0;
    int bobPoints = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        alicePoints++;
      } else if (a.get(i) < (b.get(i))) {
        bobPoints++;
      }
    }
    solution.add(alicePoints);
    solution.add(bobPoints);

    return solution;
  }
}


