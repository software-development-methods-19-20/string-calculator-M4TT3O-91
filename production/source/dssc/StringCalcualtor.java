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
        String delimiter = "[,\n\r]+";
        int index = numbers.indexOf("\n");
        int size = numbers.length();

        if(numbers.contains("//")) {
                String del =numbers.substring(2,index).replaceAll("[|]","");
                numbers=numbers.substring(index+1,size).replaceAll("\n\r|\r|\n","");
                delimiter = "["+del+",\n\r]+";
            System.out.println("DEL "+del);
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

}
