//  HackerRank Problem Solving - Algorithms
//  Strings: CamelCase (Easy)
//  https://www.hackerrank.com/challenges/camelcase/problem
//  Created by Austin Swack
//  Created on 2/17/2022
import java.io.*;

public class CamelCase {
  public static int camelcase(String s) {
    int words = 1;
    char[] camel = s.toCharArray();

    for (char c : camel) {
      if (Character.isUpperCase(c)) {
        words++;
      }
    }

    return words;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/CamelCase.txt"));

    String s = bufferedReader.readLine();
    int result = camelcase(s);
    System.out.println(result);

    bufferedReader.close();
  }
}
