//  HackerRank Java
//  Data Structures: Java Dequeue
//  https://www.hackerrank.com/challenges/java-dequeue/problem
//  Created by Austin Swack
//  Created on 2/25/2022
import java.io.File;
import java.io.IOException;
import java.util.*;

public class JavaDeque {
  public static void main (String[] args) throws IOException {
    Scanner in = new Scanner(new File("Java/data/JavaDeque.txt"));
    Deque<Integer> deque = new ArrayDeque<>();
    HashSet<Integer> set = new HashSet<>();
    int n = in.nextInt();
    int m = in.nextInt();
    int max = 1;

    for (int i = 0; i < n; i++) {
      int num = in.nextInt();

      deque.add(num);
      set.add(num);

      if (deque.size() == m) {
        if (set.size() > max) max = set.size();
        int old = deque.remove();
        if (!deque.contains(old)) set.remove(old);
      }

    }
    System.out.println(max);
  }
}



