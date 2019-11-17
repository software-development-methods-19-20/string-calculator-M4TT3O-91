package dssc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCalcualtor {
    public static int add (String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }else{
            return StringAdder(numbers);
        }
    }

    public static int StringAdder(String numbers){
        int sum=0;
        String delimiter ="[,]+";
        String[] token = numbers.split(delimiter);

        return Arrays.stream(numbers.split(delimiter)).map(x->Integer.parseInt(x)).reduce(0,(x,y)->x+y);

        /*for (String i : token)
            sum =sum+Integer.valueOf(i);
        return sum;*/

    }

}





/*
String s = "prefix/dir1/dir2/dir3/dir4";
String[] tokens = s.split("/");

for (String t : tokens)
  System.out.println(t);
* */