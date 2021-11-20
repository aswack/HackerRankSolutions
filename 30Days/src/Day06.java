//  HackerRank 30 Days of Code
//  Day 06 - Let's Review!
//
// Created by Austin Swack
// Created on 11/20/2021

import java.util.Scanner;

public class Day06 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.nextInt();
    scan.nextLine();

    while (scan.hasNextLine()){
      String even = "";
      String odd = "";
      String s = scan.nextLine();

      for (int i = 0; i<s.length(); i++){
        if (i%2==0)
          even += s.charAt(i);
        else odd += s.charAt(i);
      }
      System.out.println(even+" "+odd);
    }
    scan.close();
  }
}