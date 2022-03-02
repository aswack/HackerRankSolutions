//  HackerRank Problem Solving - Algorithms
//  Implementation: Jumping on the Clouds (Easy)
//  https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
//  Created by Austin Swack
//  Created on 3/1/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class CloudJump {
  public static int jumpingOnClouds(List<Integer> c) {
    int index = 0;
    int jumps = 0;
    boolean running = true;

    while (running) {
      if (index + 2 < c.size() && c.get(index + 2) == 0) {
        index += 2;
        jumps++;
      } else if (index + 1 < c.size() && c.get(index + 1) == 0) {
        index++;
        jumps++;
      }
      if (index == c.size() - 1) {
        running = false;
      }
    }
    return jumps;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Cloudjump.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt).toList();

    int result = jumpingOnClouds(c);
    System.out.println(result);

    bufferedReader.close();
  }
}
