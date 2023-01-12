import java.io.*;
import java.util.*;
public class ArrayListPosition {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<ArrayList<Integer>> array2D = new ArrayList<>();
    for (int i = 0; i < n; i ++) {
      int d = in.nextInt();
      ArrayList<Integer> array = new ArrayList<>();
      for (int j = 0; j < d; j ++) {
        int a = in.nextInt();
        //System.out.println(" ");
        //System.out.println("a = " + a);
        array.add(a);
      }
      array2D.add(array);
    }
    int q = in.nextInt();
    for (int i = 0; i < q; i ++) {
      int l = in.nextInt();
      int r = in.nextInt();
      try {
        System.out.println(array2D.get(l - 1).get(r - 1));
      } catch (IndexOutOfBoundsException e) {
        System.out.println("ERROR!");
      }
    }
  }
}
