//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
package practice;

public class CountingValleys {

  public static void main(String[] args) {

    int n = 2;
    String s = "UDDDUDUU";

    System.out.println(countingValleys(n, s));
  }

  static int countingValleys(int n, String s) {
    int countValleys = 0;
    int currentLevel = 0;
    for (int i = 0; i < s.length(); i++) {
      boolean down = String.valueOf(s.charAt(i)).equals("D");
      if (currentLevel == 0 && down) {
        countValleys++;
      }
      currentLevel += down ? -1 : 1;
    }
    return countValleys;
  }
}

