package xor;

import java.util.Arrays;

public class XORmatrix {


  public static int[][] drawXoRMatrix(int d) {
    int[][] xorMatrix = new int[d][d];

    for (int i = 0; i < d; i++) {
      for (int j = 0; j < d; j++) {
        xorMatrix[i][j] = i ^ j;
      }
      // System.out.println(Arrays.toString(xorMatrix[i]));

    }

    return xorMatrix;
  }
}
