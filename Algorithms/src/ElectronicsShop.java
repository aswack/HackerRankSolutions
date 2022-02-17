//  HackerRank Problem Solving - Algorithms
//  Implementation: Electronics Shop (Easy)
//  https://www.hackerrank.com/challenges/electronics-shop/problem
//  Created by Austin Swack
//  Created on 2/17/2022
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
  static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
    /* naive solution
    int cost = -1;
    for (int key : keyboards) {
      for (int drive : drives) {
        if (drive + key <= budget && drive + key > cost) {
          cost = drive + key;
        }
      }
    }
    return cost; */

    //potential refined solution involving sorts
    int cost = -1;
    int spent;
    Arrays.sort(keyboards);
    Arrays.sort(drives);
    for (int i = keyboards.length - 1; i >= 0; i--) {
      for (int j = drives.length - 1; j >= 0; j--) {
        spent = keyboards[i] + drives[j];
        if (spent <= budget && spent > cost) {
          cost = spent;
        }
      }
    }
    return cost;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(new File("Algorithms/data/ElectronicsShop.txt"));

    String[] bnm = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    int b = Integer.parseInt(bnm[0]);
    int n = Integer.parseInt(bnm[1]);
    int m = Integer.parseInt(bnm[2]);

    int[] keyboards = new int[n];

    String[] keyboardsItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
      int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
      keyboards[keyboardsItr] = keyboardsItem;
    }

    int[] drives = new int[m];

    String[] drivesItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    for (int drivesItr = 0; drivesItr < m; drivesItr++) {
      int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
      drives[drivesItr] = drivesItem;
    }

    int moneySpent = getMoneySpent(keyboards, drives, b);
    System.out.println(String.valueOf(moneySpent));

    scanner.close();
  }
}
