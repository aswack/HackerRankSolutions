//  HackerRank Problem Solving - Algorithms
//  Implementation: Cats and a Mouse (Easy)
//  https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
//  Created by Austin Swack
//  Created on 2/5/2022
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CatMouse {

  static String catAndMouse(int x, int y, int z) {
    int catA = Math.abs(x - z);
    int catB = Math.abs(y - z);

    if (catA < catB) {
      return "Cat A";
    } else if (catA > catB) {
      return "Cat B";
    } else {
      return "Mouse C";
    }
  }

  private static Scanner scanner;

  static {
    try {
      scanner = new Scanner(new File("Algorithms/data/CatMouse.txt"));
    } catch (FileNotFoundException ignored) {

    }
  }

  public static void main(String[] args) throws IOException {
    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < q; i++) {
      String[] xyz = scanner.nextLine().split(" ");

      int x = Integer.parseInt(xyz[0]);
      int y = Integer.parseInt(xyz[1]);
      int z = Integer.parseInt(xyz[2]);

      String result = catAndMouse(x, y, z);
      System.out.println(result);
    }
    scanner.close();
  }
}
