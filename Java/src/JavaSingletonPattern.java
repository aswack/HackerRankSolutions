//  HackerRank Java
//  Advanced: Java Singleton Pattern
//  https://www.hackerrank.com/challenges/java-singleton/problem
//  Created by Austin Swack
//  Created on 12/19/2021
class Singleton{
  public String str;
  private static Singleton instance = new Singleton();

  private Singleton() {}

  static Singleton getSingleInstance() {
    return instance;
  }
}

//OUTPUT IS HANDLED IN A HIDDEN SOLUTION CLASS