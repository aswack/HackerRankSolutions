//  HackerRank 30 Days of Code
//  Day 23: BST Level-Order Traversal
//  https://www.hackerrank.com/challenges/30-binary-trees/problem
//  Created by Austin Swack
//  Created on 12/7/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// BSTNode class is in Day 22
public class Day23 {

  static void levelOrder(BSTNode root){
    Queue<BSTNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      BSTNode current = q.poll();
      System.out.print(current.data + " ");

      if (current.left != null)
        q.offer(current.left);
      if (current.right != null)
        q.offer(current.right);
    }
  }

  public static BSTNode BSTinsert(BSTNode root,int data){
    if(root == null) {
      return new BSTNode(data);
    } else {
      BSTNode current;
      if(data <= root.data){
        current = BSTinsert(root.left,data);
        root.left = current;
      } else {
        current = BSTinsert(root.right,data);
        root.right = current;
      }
      return root;
    }
  }
  public static void main(String[] args) throws FileNotFoundException {
    File input = new File("30Days/data/day23input.txt");
    Scanner scan = new Scanner(input);
    int testCases = scan.nextInt();
    BSTNode root = null;

    while(testCases --> 0) {
      int data = scan.nextInt();
      root = BSTinsert(root, data);
    }
    levelOrder(root);
  }
}