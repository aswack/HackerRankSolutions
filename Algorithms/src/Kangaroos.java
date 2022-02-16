//  HackerRank Problem Solving - Algorithms
//  Implementation: Number Line Jumps (Easy)
//  https://www.hackerrank.com/challenges/kangaroo/problem
//  Created by Austin Swack
//  Created on 2/16/2022
import java.io.*;

public class Kangaroos {
  public static String kangaroo(int x1, int v1, int x2, int v2) {
    boolean running = true;
    int kang1 = x1;
    int kang2 = x2;

    boolean kang1leads = false;
    int kang1diff = 0, kang2diff = 0;

    if (kang1 > kang2) {
      kang1leads = true;
      kang1diff = kang1 - kang2;
    } else {
      kang2diff = kang2 - kang1;
    }

    if (v1 == v2 && x1 != x2) {
      return "NO";
    }

    while (running) {
      if (kang1 == kang2) {
        return "YES";
      }

      kang1 += v1;
      kang2 += v2;

      // if the distance between the kangaroo in the lead grows, then the two roos will never meet
      if (kang1leads) {
        if (kang1diff < kang1 - kang2) {
          return "NO";
        }
      } else {
        if (kang2diff < kang2 - kang1) {
          return "NO";
        }
      }

    }
    return "NO";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Kangaroos.txt"));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int x1 = Integer.parseInt(firstMultipleInput[0]);
    int v1 = Integer.parseInt(firstMultipleInput[1]);
    int x2 = Integer.parseInt(firstMultipleInput[2]);
    int v2 = Integer.parseInt(firstMultipleInput[3]);

    String result = kangaroo(x1, v1, x2, v2);
    System.out.println(result);

    bufferedReader.close();
  }
}
