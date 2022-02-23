//  HackerRank Problem Solving - Algorithms
//  Implementation: Counting Valleys (Easy)
//  https://www.hackerrank.com/challenges/counting-valleys/problem
//  Created by Austin Swack
//  Created on 2/22/2022
import java.io.*;

public class Valleys {
  public static int countingValleys(int steps, String path) {
    int altitude = 0;
    int valleys = 0;

    for (char c : path.toCharArray()) {
      if (c == 'U') {
        altitude++;
      } else {
        altitude--;
      }
      if (altitude == 0 && c == 'U') {
        valleys++;
      }
    }
    return valleys;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Valleys.txt"));

    int steps = Integer.parseInt(bufferedReader.readLine().trim());
    String path = bufferedReader.readLine();

    int result = countingValleys(steps, path);
    System.out.println(result);

    bufferedReader.close();
  }
}
