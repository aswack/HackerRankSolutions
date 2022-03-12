//  HackerRank Problem Solving - Algorithms
//  Warmup: Diagonal Difference (Easy)
//  https://www.hackerrank.com/challenges/diagonal-difference/problem
//  Created by Austin Swack
//  Created on 3/11/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Diagonals {
  public static int diagonalDifference(List<List<Integer>> arr) {
    int primaryDiagonal = 0;
    int secondaryDiagonal = 0;

    for (int i = 0; i < arr.size(); i++) {
      primaryDiagonal += arr.get(i).get(i);
      secondaryDiagonal += arr.get(i).get(arr.size() - 1 - i);
    }

    return Math.abs(primaryDiagonal - secondaryDiagonal);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Diagonals.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n).forEach(i -> {
      try {
        arr.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = diagonalDifference(arr);
    System.out.println(result);

    bufferedReader.close();
  }
}
