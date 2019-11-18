package dssc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
        String delimiter = "[,\n]+";
        if(numbers.contains("//")) {
            delimiter = "[\n"+numbers.charAt(2)+",]+";
            int i = numbers.indexOf("\n");
            numbers = numbers.substring(i+1);
        }
        //return Arrays.stream(numbers.split(delimiter)).map(Integer::parseInt).reduce(0,(x, y)->x+y);
        List<Integer> IsNeg=Arrays.stream(numbers.split(delimiter))
                .map(Integer::parseInt).filter(x->x<0).collect(Collectors.toList());

        if((long) IsNeg.size() !=0){
            throw new RuntimeException("Negativi non ammessi!! Controllare ci sono: "+IsNeg);
        }else {
            Stream<String> list = Arrays.stream(numbers.split(delimiter));
            return list.map(Integer::parseInt).reduce(0, Integer::sum);
        }

    }
    /*subSequence(int beginIndex, int endIndex)*/
    /*throw new RuntimeException("Carta non valida");*/



}
