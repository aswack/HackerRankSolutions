//  HackerRank Problem Solving - Algorithms
//  Implementation: Flatland Space Stations (Easy)
//  https://www.hackerrank.com/challenges/flatland-space-stations/problem
//  Created by Austin Swack
//  Created on 12/31/2021
//  Revised 2/20/2022
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SpaceStation {
  static int flatlandSpaceStations(int n, int[] c) {
    Arrays.sort(c);
    int endDistance = (n - c[c.length-1]) - 1;
    int startDistance = c[0];
    int larger = Math.max(startDistance, endDistance);
    int maxDistance = 0;

    for (int i = 1; i < c.length; i++) {
      int distance = (c[i] - c[i-1]) - 1;
      if (distance > maxDistance) {
        maxDistance = distance;
      }
    }

    int midDistance = (maxDistance + 1) /2;
    return Math.max(midDistance, larger);
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(new File("Algorithms/data/SpaceStation.txt"));

    String[] nm = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nm[0]);
    int m = Integer.parseInt(nm[1]);
    int[] c = new int[m];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < m; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }

    int result = flatlandSpaceStations(n, c);
    System.out.println(result);

    scanner.close();
  }
}
