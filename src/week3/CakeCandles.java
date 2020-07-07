//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
package week3;

import java.util.HashMap;
import java.util.Map;

public class CakeCandles {

  public static void main(String[] args) {
    int[] candles = new int[]{3, 2, 1, 3, 3, 3, 3, 4};

    System.out.println(birthdayCakeCandles(candles));

  }

  static int birthdayCakeCandles(int[] ar) {
    Map<Integer, Integer> countCandles = new HashMap<>();
    int max = 0;
    for (int candle : ar) {
      max = Math.max(max, candle);
      if (!(countCandles.containsKey(candle))) {
        countCandles.put(candle, 1);
      } else {
        countCandles.replace(candle, countCandles.get(candle) + 1);
      }
    }
    return countCandles.get(max);
  }

}
