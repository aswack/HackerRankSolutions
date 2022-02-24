//  HackerRank Problem Solving - Algorithms
//  Implementation: Viral Advertising (Easy)
//  https://www.hackerrank.com/challenges/strange-advertising/problem
//  Created by Austin Swack
//  Created on 2/23/2022
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViralAds {
  public static int viralAdvertising(int n) {
    int shared = 5;
    int liked = 0;
    int total = 0;

    for (int i = 0; i < n; i++) {
      liked = shared/2;
      total += liked;

      shared = liked * 3;
    }
    return total;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/ViralAds.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());
    int result = viralAdvertising(n);
    System.out.println(result);

    bufferedReader.close();
  }
}
