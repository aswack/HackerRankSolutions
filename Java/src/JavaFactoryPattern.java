//  HackerRank Java
//  Advanced: Java Factory Pattern
//  https://www.hackerrank.com/challenges/java-factory/problem
//  Created by Austin Swack
//  Created on 12/19/2021
interface Food {
  public String getType();
}

class Pizza implements Food {

  public String getType() {
    return "Someone ordered a Fast Food!";
  }
}

class Cake implements Food {

  public String getType() {
    return "Someone ordered a Dessert!";
  }
}

class FoodFactory {

  public Food getFood(String order) {
    if (order.equals("cake")) {
      return new Cake();
    } else if (order.equals("pizza")) {
      return new Pizza();
    }
    return null;
  }
}

public class JavaFactoryPattern {

  public static void main(String[] args) {
    FoodFactory foodFactory = new FoodFactory();
    Food food = foodFactory.getFood("cake");

    System.out.println("The factory returned " + food.getClass());
    System.out.println(food.getType());

    food = foodFactory.getFood("pizza");
    System.out.println("The factory returned " + food.getClass());
    System.out.println(food.getType());
  }
}