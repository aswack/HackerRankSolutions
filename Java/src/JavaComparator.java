import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {

  public int compare(Player a, Player b) {
    if (a.score == b.score) {
      return a.name.compareTo(b.name);
    } else {
      return b.score - a.score;
    }
  }
}

class Player{
  String name;
  int score;

  Player(String name, int score){
    this.name = name;
    this.score = score;
  }
}

public class JavaComparator {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Java/data/JavaComparator.txt");
    Scanner scan = new Scanner(file);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();

    for(int i = 0; i < n; i++){
      player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();

    Arrays.sort(player, checker);
    for (Player p : player) {
      System.out.printf("%s %s\n", p.name, p.score);
    }
  }
}