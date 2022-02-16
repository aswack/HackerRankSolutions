//  HackerRank Problem Solving - Algorithms
//  Strings: Mars Exploration (Easy)
//  https://www.hackerrank.com/challenges/mars-exploration/problem
//  Created by Austin Swack
//  Created on 2/15/2022
import java.io.*;

public class Mars {
  public static int marsExploration(String s) {
    char[] message = s.toCharArray();
    int count = 0;
    for (int i = 1; i <= message.length; i++) {
      if ((i % 3 == 1 && message[i-1] != 'S') || (i % 3 == 0 && message[i-1] != 'S')) {
        count++;
      } else if (i % 3 == 2 && message[i-1] != 'O') {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Mars.txt"));

    String s = bufferedReader.readLine();

    int result = marsExploration(s);
    System.out.println(result);

    bufferedReader.close();
  }
}
