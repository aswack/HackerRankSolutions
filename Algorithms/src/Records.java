//  HackerRank Problem Solving - Algorithms
//  Implementation: Breaking the Records (Easy)
//  https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
//  Created by Austin Swack
//  Created on 2/21/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Records {
  public static List<Integer> breakingRecords(List<Integer> scores) {
    List<Integer> brokenRecords = new ArrayList<>();
    int bestGame = scores.get(0);
    int bestChanged = 0;
    int worstGame = scores.get(0);
    int worstChanged = 0;

    for (int score : scores) {
      if (score > bestGame) {
        bestGame = score;
        bestChanged++;
      } else if (score < worstGame) {
        worstGame = score;
        worstChanged++;
      }
    }
    brokenRecords.add(bestChanged);
    brokenRecords.add(worstChanged);
    return brokenRecords;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Records.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = breakingRecords(scores);
    System.out.println(result);
  }
}
