//  HackerRank Problem Solving - Algorithms
//  Implementation: The Hurdle Race (Easy)
//  https://www.hackerrank.com/challenges/the-hurdle-race/problem
//  Created by Austin Swack
//  Created on 2/7/2022
import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Hurdles {
  public static int hurdleRace(int k, List<Integer> height) {
    int maxHeight = height.get(0);
    for (int h : height) {
      if (h > maxHeight) {
        maxHeight = h;
      }
    }
    if (k > maxHeight) {
      return 0;
    }
    return maxHeight-k;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Hurdles.txt"));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int k = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = hurdleRace(k, height);

    System.out.println(result);

    bufferedReader.close();
  }
}
