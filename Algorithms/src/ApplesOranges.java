//  HackerRank Problem Solving - Algorithms
//  Implementation: Apple and Orange (Easy)
//  https://www.hackerrank.com/challenges/apple-and-orange/problem
//  Created by Austin Swack
//  Created on 12/27/2021
import java.io.*;
import java.util.*;

public class ApplesOranges {

  public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree, List<Integer> apples, List<Integer> oranges) {
    int appleStrike = 0;
    int orangeStrike = 0;

    for (int appleHitLocation : apples) {
      if (appleTree + appleHitLocation >= houseStart && appleTree + appleHitLocation <= houseEnd) {
        appleStrike++;
      }
    }

    for (int orangeHitLocation : oranges) {
      if (orangeTree + orangeHitLocation >= houseStart && orangeTree + orangeHitLocation <= houseEnd) {
        orangeStrike++;
      }
    }

    System.out.println(appleStrike + "\n" + orangeStrike);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/ApplesOranges.txt"));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int houseStart = Integer.parseInt(firstMultipleInput[0]);
    int houseEnd = Integer.parseInt(firstMultipleInput[1]);
    String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int appleTreeLocation = Integer.parseInt(secondMultipleInput[0]);
    int orangeTreeLocation = Integer.parseInt(secondMultipleInput[1]);
    String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int numApples = Integer.parseInt(thirdMultipleInput[0]);
    int numOranges = Integer.parseInt(thirdMultipleInput[1]);
    String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    
    List<Integer> apples = new ArrayList<>();
    for (int i = 0; i < numApples; i++) {
      int applesItem = Integer.parseInt(applesTemp[i]);
      apples.add(applesItem);
    }

    String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    List<Integer> oranges = new ArrayList<>();

    for (int i = 0; i < numOranges; i++) {
      int orangesItem = Integer.parseInt(orangesTemp[i]);
      oranges.add(orangesItem);
    }

    countApplesAndOranges(houseStart, houseEnd, appleTreeLocation, orangeTreeLocation, apples, oranges);
    bufferedReader.close();
  }
}