// https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

package week2;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public static void main(String[] args) {

    String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
    String[] note = new String[]{"give", "one", "grand", "today"};

    checkMagazine(magazine, note);

  }

  private static void checkMagazine(String[] magazine, String[] note) {
    if (note.length > magazine.length) {
      System.out.println("No");
      return;
    }
    Map<String, Integer> noteMap = textArrayToWordMap(note);
    int i = 0;
    while (!noteMap.isEmpty() && i < magazine.length) {
      String current = magazine[i];
      if (noteMap.containsKey(current)) {
        if (noteMap.get(current) == 1) {
          noteMap.remove(current);
        } else {
          noteMap.replace(current, noteMap.get(current) - 1);
        }
      }
      i++;
    }
    System.out.println(noteMap.isEmpty() ? "Yes" : "No");
  }

  private static Map<String, Integer> textArrayToWordMap(String[] text) {
    Map<String, Integer> dictionary = new HashMap<>();
    for (String word : text) {
      if (!(dictionary.containsKey(word))) {
        dictionary.put(word, 1);
      } else {
        dictionary.replace(word, dictionary.get(word) + 1);
      }
    }
    return dictionary;
  }

}
