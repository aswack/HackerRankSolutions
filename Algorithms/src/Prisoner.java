//  HackerRank Problem Solving - Algorithms
//  Implementation: Save the Prisoner! (Easy)
//  https://www.hackerrank.com/challenges/save-the-prisoner/problem
//  Created by Austin Swack
//  Created on 3/14/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class Prisoner {
  public static int saveThePrisoner(int n, int m, int s) {
    return ((s - 1 + m - 1) % n) + 1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Prisoner.txt"));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        int s = Integer.parseInt(firstMultipleInput[2]);

        int result = saveThePrisoner(n, m, s);
        System.out.println(result);

      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }
}
