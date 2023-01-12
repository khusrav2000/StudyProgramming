import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.util.Collections;

public class BigDecimalSort {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    ArrayList<Pair> numbers = new ArrayList<>();
    while(testCases > 0) {
      String line = in.nextLine();
      numbers.add(new Pair(new BigDecimal(line), line));
      testCases --;
    }

    numbers.sort((o1, o2) -> o2.getBigDecimal().compareTo(o1.getBigDecimal()));

    for (Pair number: numbers) {
      System.out.println(number.getBigDecimal().toString());
    }
  }
}

class Pair {
  BigDecimal bigDecimal;
  String stringDecimal;

  Pair(BigDecimal bigDecimal, String stringDecimal) {
    this.bigDecimal = bigDecimal;
    this.stringDecimal = stringDecimal;
  }

  public String getStringDecimal() {
    return stringDecimal;
  }

  public BigDecimal getBigDecimal() {
    return bigDecimal;
  }
}