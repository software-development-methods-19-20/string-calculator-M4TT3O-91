package dssc;

public class StringCalcualtor {
    public static int add (String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }else if (numbers.contains(",")) {
            String[] token = numbers.split(",");
            return Integer.valueOf(token[0]) + Integer.valueOf(token[1]);
        }else {
            return Integer.valueOf(numbers);
        }
    }
}

