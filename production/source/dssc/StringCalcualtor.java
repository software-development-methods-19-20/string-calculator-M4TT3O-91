package dssc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Stream<String> st =Arrays.asList(numbers).stream();
        String delimiter = "[,\n]+";
        Stream<String> list=Arrays.stream(numbers.split(delimiter));

        return list.map(Integer::parseInt).reduce(0,(x, y)->x+y);
        //return Arrays.stream(numbers.split(delimiter)).map(Integer::parseInt).reduce(0,(x, y)->x+y);

    }
    /*subSequence(int beginIndex, int endIndex)*/

}
