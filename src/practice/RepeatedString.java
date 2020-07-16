// https://www.hackerrank.com/challenges/repeated-string/problem
package practice;

import java.util.stream.IntStream;

public class RepeatedString {
  public static void main(String[] args) {
    String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
    long n = 549382313570L;

    System.out.println(repeatedString(s, n));

  }

  static long repeatedString(String s, long n) {
    long multiplicator = n / s.length();
    int k = (int) (n % s.length());
    int countAs = s.chars().filter(c -> c == 'a').reduce(0, (sum, c) -> sum + 1);
    int countAsPartial = IntStream.range(0, k).filter(i -> s.charAt(i) == 'a').reduce(0, (sum, c) -> sum + 1);
    return countAs * multiplicator + countAsPartial;
  }


}
