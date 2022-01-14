//  HackerRank Problem Solving - Algorithms
//  Warmup: Birthday Cake Candles (Easy)
//  https://www.hackerrank.com/challenges/birthday-cake-candles/problem
//  Created by Austin Swack
//  Created on 1/13/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BirthdayCakeCandles {

  public static int birthdayCakeCandles(List<Integer> candles) {
    candles.sort(Collections.reverseOrder());
    int count = 1;
    for (int i = 1; i < candles.size(); i++) {
      if (candles.get(i).equals(candles.get(i-1))) {
        count++;
      } else {
        break;
      }
    }
    return count;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Candles.txt"));

    List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = birthdayCakeCandles(candles);
    System.out.println(result);

    bufferedReader.close();
  }
}
