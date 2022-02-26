//  HackerRank Java
//  Data Structures: Java 1-D Array (Part 2)
//  https://www.hackerrank.com/challenges/java-1d-array/problem
//  Created by Austin Swack
//  Created on 2/25/2022
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ArrayGame {
  public static boolean canWin(int leap, int[] game) {
    Stack<Integer> DFS = new Stack<>();
    DFS.push(0);

    while (!DFS.isEmpty()) {
      int index = DFS.pop();
      if (index >= game.length) return true;
      if (index < 0 || game[index] == 1) continue;

      // Marks as visited
      game[index] = 1;

      DFS.push(index + 1);
      DFS.push(index - 1);
      DFS.push(index + leap);
    }
    return false;
  }

  private static boolean isSolvable(int leap, int[] game, int index) {
    if (index < 0 || game[index] == 1) return false;
    if ((index == game.length - 1) || index + leap > game.length - 1) return true;

    game[index] = 1;
    return isSolvable(leap, game, index + 1) || isSolvable(leap, game, index - 1) || isSolvable(leap, game, index + leap);
  }

  public static void main (String[] args) throws IOException {
    Scanner scan = new Scanner(new File("Java/data/ArrayGame.txt"));
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
    scan.close();
  }
}