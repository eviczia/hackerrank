public class AlternatingCharacters {

  public static void main(String[] args) {
    int n = 5;
    String s1 = "AAAA";
    String s2 = "BBBBB";
    String s3 = "ABABABAB";
    String s4 = "BABABA";
    String s5 = "AAABBB";

    System.out.println(alternatingCharacters(s1));
    System.out.println(alternatingCharacters(s2));
    System.out.println(alternatingCharacters(s3));
    System.out.println(alternatingCharacters(s4));
    System.out.println(alternatingCharacters(s5));
  }

  static int alternatingCharacters(String s) {
    int count = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        count++;
      }
    }
    return count;
  }

}
