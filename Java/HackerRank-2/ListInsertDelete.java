import java.util.*;

public class ListInsertDelete {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i ++) {
      int a = scan.nextInt();
      list.add(a);
    }
    int q = scan.nextInt();
    for (int i = 0 ; i < q; i ++) {
      String s = scan.next();
      if (s.equals("Insert")) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        list.add(x, y);
      } else {
        int x = scan.nextInt();
        list.remove(x);
      }
    }
    for (Integer a: list) {
      System.out.print(a);
      System.out.print(" ");
    }
  }
}
