package Lamdajava8;

import java.util.Arrays;
import java.util.*;

public class LambdaForEachPgm {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);

    ls.stream().forEach(t -> {
      System.out.println(t);
    });

    Map<Integer, String> mp = new HashMap<>();
    mp.put(1, "Pradeep");
    mp.put(2, "Vinoth");

    mp.forEach((k, v) -> System.out.println(k + "-" + v));

    mp.entrySet().forEach(obj -> System.out.println(obj));

    // Filter - conditional check

    ls.stream()
    .filter(t -> t.toString().startsWith("3"))
    .forEach(t -> System.out.println("Three"));
    
    mp.entrySet().stream()
    .filter(k -> k.getKey()==2)
    .forEach(obj -> System.out.println(obj));

  }

}
/*
 1
2
3
4
5
1-Pradeep
2-Vinoth
1=Pradeep
2=Vinoth
Three
2=Vinoth
 */