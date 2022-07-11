package Lamdajava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateFun {
  public static void main(String args[]) {
    List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);

    Predicate<Integer> pre = (t) -> {
      if (t % 2 == 0) {
        return true;
      } else {
        return false;
      }
    };
    ls.stream().filter((t) -> {
      if (t % 2 == 0) {
        return true;
      } else {
        return false;
      }
    }).forEach(t -> System.out.println("Even num - " + t));
    // System.out.println(pre.test(8));

    ls.stream()
      .filter(t -> (t % 2 != 0))
      .forEach(t -> System.out.println("odd num - " + t));
  }

}
