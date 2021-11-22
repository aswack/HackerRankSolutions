//  HackerRank 30 Days of Code
//  Day 08 - Dictionaries and Maps
//
// Created by Austin Swack
// Created on 11/22/2021

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Day08 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Map<String, Integer> phoneBook = new HashMap<>();
    int n = in.nextInt();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      phoneBook.put(name, phone);
    }
    while(in.hasNext()){
      String s = in.next();
      if (phoneBook.containsKey(s)){
        System.out.println(s+"="+phoneBook.get(s));
      } else {
        System.out.println("Not found");
      }
    }
    in.close();
  }
}