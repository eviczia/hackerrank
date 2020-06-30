// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

package week2;

import java.util.Arrays;

public class LeftRotation {

  public static void main(String[] args) {
    int length = 5;
    int rotations = 4;
    int[] rotateThis = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(rotLeft(rotateThis, rotations)));

  }

  private static int[] rotLeft(int[] a, int d) {
    int[] leftRotated = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      int k = d + i - (d + i < a.length ? 0 : a.length);
      leftRotated[i] = a[k];
    }
    return leftRotated;
  }

}
