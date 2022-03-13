//  HackerRank Problem Solving - Algorithms
//  Implementation: Picking Numbers (Easy)
//  https://www.hackerrank.com/challenges/picking-numbers/problem
//  Created by Austin Swack
//  Created on 3/12/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PickingNumbers {
  public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int num = a.get(0);
    int set = 1;
    int max = 0;

    for (int i = 1; i < a.size(); i++) {
      if (a.get(i) == num || a.get(i) == num + 1) {
        set++;
      } else {
        num = a.get(i);
        set = 1;
      }
      if (set > max) {
        max = set;
      }
    }
    return max;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/PickingNumbers.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = pickingNumbers(a);
    System.out.println(result);

    bufferedReader.close();
  }
}
