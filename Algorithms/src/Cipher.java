//  HackerRank Problem Solving - Algorithms
//  Strings: Caesar Cipher (Easy)
//  https://www.hackerrank.com/challenges/caesar-cipher-1/problem
//  Created by Austin Swack
//  Created on 2/14/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cipher {
  public static String caesarCipher(String s, int k) {
    char[] cipher = s.toCharArray();
    StringBuilder result = new StringBuilder();
    int alphaPos;
    int newPos;

    for (char c : cipher) {
      if (Character.isLowerCase(c)){
        alphaPos = c - 'a';
        newPos = (alphaPos + k) % 26;
        c = (char)('a' + newPos);
      } else if (Character.isUpperCase(c)){
        alphaPos = c - 'A';
        newPos = (alphaPos + k) % 26;
        c = (char)('A' + newPos);
      }

      result.append(c);
    }

    return String.valueOf(result);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Cipher.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String s = bufferedReader.readLine();
    int k = Integer.parseInt(bufferedReader.readLine().trim());

    String result = caesarCipher(s, k);
    System.out.println(result);

    bufferedReader.close();
  }
}
