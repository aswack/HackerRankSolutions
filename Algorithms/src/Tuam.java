//  HackerRank Problem Solving - Algorithms
//  Implementation: Taum and B'day (Easy)
//  https://www.hackerrank.com/challenges/taum-and-bday/problem
//  Created by Austin Swack
//  Created on 3/15/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class Tuam {
  public static long taumBday(int b, int w, int bc, int wc, int z) {
    if (bc + z < wc) {
      wc = bc + z;
    } else if (wc + z < bc) {
      bc = wc + z;
    }

    return ((long) b * bc) + ((long) w * wc);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Taum.txt"));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int b = Integer.parseInt(firstMultipleInput[0]);
        int w = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int bc = Integer.parseInt(secondMultipleInput[0]);
        int wc = Integer.parseInt(secondMultipleInput[1]);
        int z = Integer.parseInt(secondMultipleInput[2]);

        long result = taumBday(b, w, bc, wc, z);
        System.out.println(result);

      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }
}
