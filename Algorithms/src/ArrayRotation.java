//  HackerRank Problem Solving - Algorithms
//  Implementation: Circular Array Rotation (Easy)
//  https://www.hackerrank.com/challenges/circular-array-rotation/problem
//  Created by Austin Swack
//  Created on 12/27/2021
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayRotation {
  public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    List<Integer> solution = new ArrayList<>();

    while (k > 0) {
      int i = a.remove(a.size()-1);
      a.add(0, i);
      k--;
    }

    for (int query : queries) {
      solution.add(a.get(query));
    }

    return solution;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/ArrayRotation.txt"));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);
    int k = Integer.parseInt(firstMultipleInput[1]);
    int q = Integer.parseInt(firstMultipleInput[2]);

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
          try {
            return bufferedReader.readLine().replaceAll("\\s+$", "");
          } catch (IOException ex) {
            throw new RuntimeException(ex);
          }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = circularArrayRotation(a, k, queries);
    for (int i : result) {
      System.out.println(i);
    }

    bufferedReader.close();
  }
}
