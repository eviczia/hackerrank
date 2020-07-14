package practice;

public class SubstringComparisons {

  public static void main(String[] args) {
    System.out.println(getSmallestAndLargest("welcometojava", 3));

  }

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "zzz";
    String largest = "AAA";
    for (int i = 0; i < s.length() - k + 1; i++) {
      String substring = s.substring(i, i + k);
      if (substring.compareTo(smallest) < 0) {
        smallest = substring;
      }
      if (substring.compareTo(largest) > 0) {
        largest = substring;
      }
    }
    return smallest + "\n" + largest;
  }

}
