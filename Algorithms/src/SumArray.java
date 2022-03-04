//  HackerRank Problem Solving - Algorithms
//  Implementation: Simple Array Sum (Easy)
//  https://www.hackerrank.com/challenges/simple-array-sum/problem
//  Created by Austin Swack
//  Created on 3/3/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class SumArray {
  public static int simpleArraySum(List<Integer> ar) {
    int sum = 0;
    for (int i : ar) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/SumArray.txt"));

    int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = simpleArraySum(ar);
    System.out.println(result);

    bufferedReader.close();
  }
}
