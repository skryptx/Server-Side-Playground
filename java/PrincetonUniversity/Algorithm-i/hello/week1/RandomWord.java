/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    String champion = "";
    int i = 1;
    while (true) {
      boolean prob = StdRandom.bernoulli(1 / i++);
      if (StdIn.isEmpty()) {
        break;
      }
      String curr = StdIn.readString();
      if (prob) {
        champion = curr;
      }
    }
    StdOut.println(champion);
  }
}
