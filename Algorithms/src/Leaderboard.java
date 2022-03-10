//  HackerRank Problem Solving - Algorithms
//  Implementation: Climbing the Leaderboard (Medium)
//  https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
//  Created by Austin Swack
//  Created on 3/9/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Leaderboard {
  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    List<Integer> distinctRanks = new ArrayList<>();
    List<Integer> playerRanks = new ArrayList<>();

    for (int i : ranked) {
      if (!distinctRanks.contains(i)) {
        distinctRanks.add(i);
      }
    }
    Collections.sort(distinctRanks);
    Collections.reverse(distinctRanks);


    for (int score : player) {
      if (!distinctRanks.contains(score)) {
        distinctRanks.add(score);
        Collections.sort(distinctRanks);
        Collections.reverse(distinctRanks);
      }
      int rank = distinctRanks.indexOf(score) + 1;
      playerRanks.add(rank);
    }

    return playerRanks;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Leaderboard.txt"));

    int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = climbingLeaderboard(ranked, player);
    System.out.println(result);

    bufferedReader.close();
  }
}
