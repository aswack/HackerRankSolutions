//  HackerRank Problem Solving - Algorithms
//  Search: Ice Cream Parlor (Easy)
//  https://www.hackerrank.com/challenges/icecream-parlor/problem
//  Created by Austin Swack
//  Created on 2/16/2022
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class IceCream {
  public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
   //O(n) solution
    ArrayList<Integer> solution = new ArrayList<>();

    for (int i = 0; i < arr.size(); i++) {
      int remainingCost = m - arr.get(i);
      int remainingCostIndex = arr.indexOf(remainingCost);

      if (remainingCostIndex == i) {
        remainingCostIndex = arr.lastIndexOf(remainingCost);
        if (remainingCostIndex == i) {
          continue;
        }
      }

      if (remainingCostIndex != -1) {
        solution.add(i + 1);
        solution.add(remainingCostIndex + 1);
        break;
      }
    }

    /* O(n2) solution
    int leftPointer = 0;
    int rightPointer = 1;
    int cost = arr.get(leftPointer) + arr.get(rightPointer);
    ArrayList<Integer> solution = new ArrayList<>();

    while (cost != m && rightPointer < arr.size()) {
      for (int i  = rightPointer; i < arr.size(); i++) {
        cost = arr.get(leftPointer) + arr.get(i);
        if (cost == m) {
          rightPointer = i;
          solution.add(leftPointer + 1);
          solution.add(rightPointer + 1);
          return solution;
        }
      }
      leftPointer++;
      rightPointer++;
    }

    solution.add(leftPointer + 1);
    solution.add(rightPointer + 1);
    return solution;
    */
    return solution;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/IceCream.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Algorithms/data/IceCreamOUTPUT.txt"));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = icecreamParlor(m, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n"
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
    bufferedWriter.close();
  }
}
