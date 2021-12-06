//  HackerRank 30 Days of Code
//  Day 22: Binary Search Trees
//
// Created by Austin Swack
// Created on 12/5/2021
import java.util.*;
import java.io.*;

class BSTNode {
  BSTNode left,right;
  int data;

  BSTNode(int data){
    this.data=data;
    left=right=null;
  }
}

public class Day22 {

  public static int getHeight(BSTNode root){
    if (root == null) {
      return -1;
    } else {
      getHeight(root.left);
      getHeight(root.right);
      return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
  }

  public static BSTNode insert(BSTNode root,int data){
    if(root == null) {
      return new BSTNode(data);
    } else {
      BSTNode cur;
      if(data <= root.data) {
        cur=insert(root.left, data);
        root.left=cur;
      } else {
        cur = insert(root.right, data);
        root.right=cur;
      }
      return root;
    }
  }
  public static void main(String[] args) throws FileNotFoundException {
    File input = new File("30Days/data/day22input.txt");
    Scanner scan = new Scanner(input);
    int totalElements = scan.nextInt();
    BSTNode root = null;

    while (totalElements --> 0) {
      int data = scan.nextInt();
      root = insert(root, data);
    }

    System.out.println(getHeight(root));
  }
}