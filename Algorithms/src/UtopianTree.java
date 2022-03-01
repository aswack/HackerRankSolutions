//  HackerRank Problem Solving - Algorithms
//  Implementation: Utopian Tree (Easy)
//  https://www.hackerrank.com/challenges/utopian-tree/problem
//  Created by Austin Swack
//  Created on 2/28/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class UtopianTree {
  public static int utopianTree(int n) {
    int height = 1;
    for (int i = 0; i <= n; i++) {
      if (i % 2 != 0) {
        height *= 2;
      } else if (i != 0) {
        height++;
      }
    }
    return height;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/UtopianTree.txt"));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = utopianTree(n);
        System.out.println(result);
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }
}
