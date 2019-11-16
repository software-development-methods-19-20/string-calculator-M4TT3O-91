package dssc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalcualtor {
    public static int add (String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }else if (numbers.contains(",")) {
            return StringAdder(numbers);
        }else {
            return Integer.valueOf(numbers);
        }
    }

public static int StringAdder(String numbers){
    String[] token = numbers.split(",");
    Arrays.asList(token)
    return Integer.valueOf(token[0]) + Integer.valueOf(token[1]);

}

}





/*
String s = "prefix/dir1/dir2/dir3/dir4";
String[] tokens = s.split("/");

for (String t : tokens)
  System.out.println(t);
* */