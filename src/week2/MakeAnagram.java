// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
package week2;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagram {

  public static void main(String[] args) {
    String a = "cde";
    String b = "abc";
    System.out.println(makeAnagram(a, b));
  }

  private static int makeAnagram(String a, String b) {
    if (a.length() < b.length()) {
      return getExtras(stringToHashmap(a), b);
    } else {
      return getExtras(stringToHashmap(b), a);
    }
  }

  private static Map<Character, Integer> stringToHashmap(String shorter) {
    Map<Character, Integer> shortersMap = new HashMap<>();
    for (char letter : shorter.toCharArray()) {
      if (!(shortersMap.containsKey(letter))) {
        shortersMap.put(letter, 1);
      } else {
        shortersMap.replace(letter, shortersMap.get(letter) + 1);
      }
    }
    return shortersMap;
  }

  private static int getExtras(Map<Character, Integer> shortersMap, String longer) {
    int end = longer.length();
    int delCounter = 0;
    int i = 0;
    while (!shortersMap.isEmpty() && i < end) {
      Character current = longer.charAt(i);
      if (shortersMap.containsKey(current)) {
        if (shortersMap.get(current) == 1) {
          shortersMap.remove(current);
        } else {
          shortersMap.replace(current, shortersMap.get(current) - 1);
        }
      } else {
        delCounter++;
      }
      i++;
    }
    return shortersMap.isEmpty() ? (delCounter + (end - i)) : shortersMap.values()
        .stream()
        .filter(integer -> integer > 0)
        .reduce(delCounter, Integer::sum);
  }

}

