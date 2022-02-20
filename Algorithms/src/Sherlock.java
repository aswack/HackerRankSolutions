//  HackerRank Problem Solving - Algorithms
//  Search: Sherlock and Array (Easy)
//  https://www.hackerrank.com/challenges/sherlock-and-array/problem
//  Created by Austin Swack
//  Created on 2/20/2022

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sherlock {
  public static String balancedSums(List<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      int left = 0;
      int right = 0;

      for (int j = i - 1; j >= 0; j--) {
        left += arr.get(j);
      }

      for (int k = i + 1; k < arr.size(); k++) {
        right += arr.get(k);
      }

      if (left == right) {
        return "YES";
      }
    }
    return "NO";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Sherlock.txt"));

    int T = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, T).forEach(TItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String result = balancedSums(arr);
        System.out.println(result);

      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }
}
