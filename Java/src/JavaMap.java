//  HackerRank Java
//  Data Structures: Java Map
//  https://www.hackerrank.com/challenges/phone-book/problem
//  Created by Austin Swack
//  Created on 12/6/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaMap {
  public static void main(String[] args) {
    File file = new File("Java/data/JavaMap.txt");
    Scanner scan = null;
    try {
      scan = new Scanner(file);
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: FILE NOT FOUND");
      System.out.println(e.getMessage());
    }

    Map<String, Integer> phoneBook = new HashMap<>();

    assert scan != null;
    int entries = scan.nextInt();
    scan.nextLine();

    for(int i = 0; i < entries; i++) {
      String name = scan.nextLine();
      int phone = scan.nextInt();
      scan.nextLine();
      phoneBook.put(name, phone);
    }

    while(scan.hasNext()) {
      String search = scan.nextLine();
      if (phoneBook.containsKey(search)) {
        System.out.println(search + " = " + phoneBook.get(search));
      } else {
        System.out.println("Phone number for " + search + " not found.");
      }
    }
  }
}