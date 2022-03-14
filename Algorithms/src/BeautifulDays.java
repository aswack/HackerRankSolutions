//  HackerRank Problem Solving - Algorithms
//  Implementation: Beautiful Days at the Movies (Easy)
//  https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
//  Created by Austin Swack
//  Created on 3/13/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BeautifulDays {
  public static int beautifulDays(int i, int j, int k) {
    int days = 0;
    for (; i <=j; i++) {
      int reversed = 0;
      int temp = i;
      while (temp > 0) {
        reversed *= 10;
        reversed += temp % 10;
        temp /= 10;
      }
      if (((double)Math.abs(i - reversed)/k) - (Math.abs(i - reversed)/k) == 0) {
        days++;
      }
    }
    return days;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/BeautifulDays.txt"));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int i = Integer.parseInt(firstMultipleInput[0]);
    int j = Integer.parseInt(firstMultipleInput[1]);
    int k = Integer.parseInt(firstMultipleInput[2]);

    int result = beautifulDays(i, j, k);
    System.out.println(result);

    bufferedReader.close();
  }
}
