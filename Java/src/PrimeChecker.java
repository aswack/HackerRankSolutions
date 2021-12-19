//  HackerRank Java
//  Advanced: Prime Checker
//  https://www.hackerrank.com/challenges/prime-checker/problem
//  Created by Austin Swack
//  Created on 12/18/2021
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime {
  public void checkPrime(int... n) {
    for (int num : n) {
      if (num < 2 || (num % 2 == 0 && num != 2)) {
        continue;
      } else if (num == 2) {
        System.out.print(num + " ");
      } else {
        boolean prime = true;
        for (int j = 3; j <= Math.sqrt(num); j += 2) {
          if (num % j == 0) {
            prime = false;
            break;
          }
        }
        if (prime)
          System.out.print(num + " ");
      }

    }
    System.out.println();

  }
}

public class PrimeChecker {
  public static void main(String[] args) {
    try{
      //BufferedReader br=new BufferedReader(new InputStreamReader(in));
      BufferedReader br=new BufferedReader(new FileReader("Java/data/PrimeChecker.txt"));
      int n1=Integer.parseInt(br.readLine());
      int n2=Integer.parseInt(br.readLine());
      int n3=Integer.parseInt(br.readLine());
      int n4=Integer.parseInt(br.readLine());
      int n5=Integer.parseInt(br.readLine());
      Prime ob=new Prime();
      ob.checkPrime(n1);
      ob.checkPrime(n1,n2);
      ob.checkPrime(n1,n2,n3);
      ob.checkPrime(n1,n2,n3,n4,n5);
      Method[] methods=Prime.class.getDeclaredMethods();
      Set<String> set=new HashSet<>();
      boolean overload=false;
      for(int i=0;i<methods.length;i++)
      {
        if(set.contains(methods[i].getName()))
        {
          overload=true;
          break;
        }
        set.add(methods[i].getName());

      }
      if(overload)
      {
        throw new Exception("Overloading not allowed");
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}