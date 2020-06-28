package week1;

// https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
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

    System.out.println(hourglassSum_v1(arr1));
    System.out.println(hourglassSum_v1(arr2));
    System.out.println(hourglassSum_v1(arr3));

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
  static int hourglassSum_v1(int[][] m) {
    int[][] m1 = {
        {1, 1, 1},
        {0, 1, 0},
        {1, 1, 1}
    };
    int max = -64;
    for (int i = 0; i < m.length - 2; i++) {
      for (int j = 0; j < m[i].length - 2; j++) {
        int sum = 0;
        for (int k = 0; k < m.length; k++) {
          for (int l = 0; l < m[k].length; l++) {
            sum += m1[k][l] * m[i][j];
          }
        }
        max = Math.max(max, sum);
      }
    }
    return max;
  }

}
