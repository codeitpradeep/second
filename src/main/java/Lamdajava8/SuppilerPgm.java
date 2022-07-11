package Lamdajava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppilerPgm {

  public static void main(String[] args) {
    List<String> ls = Arrays.asList();

    System.out.print(ls.stream().findAny().orElseGet(() -> "Its pradeep"));
  }

}
