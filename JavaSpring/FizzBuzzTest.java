public class FizzBuzzTest {
    public static void main (String[] args) {
        FizzBuzz checkNumber = new FizzBuzz(); //instantiate public class with no argument
        String result1 = checkNumber.fizzBuzz(30);
        String result2 = checkNumber.fizzBuzz(20);
        String result3 = checkNumber.fizzBuzz(9);
        String result4 = checkNumber.fizzBuzz(19);    
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}