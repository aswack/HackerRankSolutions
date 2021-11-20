//  HackerRank 30 Days of Code
//  Day 04 - Class vs. Instance
//
// Created by Austin Swack
// Created on 11/18/2021

import java.util.Scanner;

class Person {
  private int age;

  public Person(int initialAge) {
    if (initialAge < 0) {
      age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    }
    age = initialAge;
  }

  public void amIOld() {
    String message;
    if (age <= 12) {
      message = "You are young.";
    } else if (age < 18) {
      message = "You are a teenager.";
    } else
      message = "You are old.";
    System.out.println(message);
  }

  public void yearPasses() {
    age++;
  }
}

public class Day04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int age = sc.nextInt();
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
    }
    sc.close();
  }
}