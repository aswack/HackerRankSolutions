//  HackerRank Problem Solving - Algorithms
//  Implementation: Migratory Birds (Easy)
//  https://www.hackerrank.com/challenges/migratory-birds/problem
//  Created by Austin Swack
//  Created on 3/16/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Birds {
  public static int migratoryBirds(List<Integer> arr) {
    int[] count = new int[5];
    int max = 0;
    int index = 0;


    for (int bird : arr) {
      count[bird - 1]++;
    }

    for (int i = count.length - 1; i >= 0; i--) {
      if (count[i] >= max) {
        max = count[i];
        index = i;
      }
    }
    return index + 1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Birds.txt"));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = migratoryBirds(arr);
    System.out.println(result);

    bufferedReader.close();
  }
}
