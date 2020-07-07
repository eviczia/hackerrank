//https://www.hackerrank.com/challenges/reduced-string/problem
package week3;

public class ReducedString {

  public static void main(String[] args) {
    System.out.println(superReducedString("thisdfgfdsertbbbbbzhhznvhxfgxfyxfxftre"));
  }

  static String superReducedString(String s) {
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        String reduced = s.substring(0, i).concat(s.substring(i + 2));
        return superReducedString(reduced);
      }
    }
    return s.isEmpty() ? "Empty String" : s;
  }
}