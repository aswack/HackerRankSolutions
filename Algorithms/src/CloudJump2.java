//  HackerRank Problem Solving - Algorithms
//  Implementation: Jumping on the Clouds: Revisited (Easy)
//  https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
//  Created by Austin Swack
//  Created on 3/2/2022
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CloudJump2 {
  static int jumpingOnClouds(int[] c, int k) {
    int energy = 100;
    int index = 0;

    do {
      index += k;
      index %= c.length;
      if (c[index] == 0) {
        energy--;
      } else {
        energy -= 3;
      }
    } while (index != 0);

    return energy;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(new File("Algorithms/data/CloudJump2.txt"));

    String[] nk = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);
    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }

    int result = jumpingOnClouds(c, k);
    System.out.println(result);

    scanner.close();
  }
}
