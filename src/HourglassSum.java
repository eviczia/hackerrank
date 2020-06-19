public class HourglassSum {
  public static void main(String[] args) {
    int[][] arr1 = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };

    int[][] arr2 = {
        {-9, -9, -9, 1, 1, 1},
        {0, -9, 0, 4, 3, 2},
        {-9, -9, -9, 1, 2, 3},
        {0, 0, 8, 6, 6, 0},
        {0, 0, 0, -2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };
    int[][] arr3 = {
        {-1, -1, 0, -9, -2, -2},
        {-2, -1, -6, -8, -2, -5},
        {-1, -1, -1, -2, -3, -4},
        {-1, -9, -2, -4, -4, -5},
        {-7, -3, -3, -2, -9, -9},
        {-1, -3, -1, -2, -4, -5}
    };

    System.out.println(hourglassSum(arr1));
    System.out.println(hourglassSum(arr2));
    System.out.println(hourglassSum(arr3));

  }


  static int hourglassSum(int[][] m) {
    int max = -64;
    for (int i = 1; i < m.length - 1; i++) {
      for (int j = 1; j < m[i].length - 1; j++) {
        int sum = m[i][j];
        for (int k = i - 1; k < i + 2; k = k + 2) {
          for (int l = j - 1; l < j + 2; l++) {
            sum += m[k][l];
          }
        }
        max = Math.max(max, sum);
      }
    }
    return max;
  }

}
