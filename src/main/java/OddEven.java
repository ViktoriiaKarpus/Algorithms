public class OddEven {


    public String oddEven(long number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";
        if (number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
        return "Undefined";

    }
}



