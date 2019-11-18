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
            if(numbers.contains("[")) {
                int i1 = numbers.indexOf('[');
                int i2 = numbers.indexOf(']');
                delimiter="[\n" + numbers.substring(i1+1,i2) + ",]+" ;
                System.out.println("del "+delimiter);
            }else {
                delimiter = "[\n" + numbers.charAt(2) + ",]+";
            }
            int i = numbers.indexOf("\n");
            numbers = numbers.substring(i + 1);
        }

        List<Integer> Number= Arrays.stream(numbers.split(delimiter))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> IsNeg=Arrays.stream(numbers.split(delimiter))
                .map(Integer::parseInt).filter(x->x<0).collect(Collectors.toList());

        if((long) IsNeg.size() !=0){
            throw new RuntimeException("Negativi non ammessi!! Controllare ci sono: "+IsNeg);
        }else {
            return Number.stream().filter(x->x<=1000).reduce(0, Integer::sum);
        }

    }

    /*subSequence(int beginIndex, int endIndex)*/
    /*throw new RuntimeException("Carta non valida");*/



}
