import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    * Expected Output:

        Hello, World!
        This is a
        multiline string
        3
        5
        Average: 12.5
        Even Numbers: [2, 4, 6, 8, 10]
        Division Result: Invalid divisor

    * */

    public static void main(String[] args) {

        System.out.println("Hello, World!");


        String message = "This is a\nmultiline string";
        System.out.println(message);


        int[] numbers = {1, 2, 3};
        System.out.println(numbers[2]);


        String text = "globe";
        System.out.println(text.length());


        List<Integer> nums= new ArrayList<>(List.of(9, 10, 15, 20));
        double result = calculateAverage(nums);
        System.out.println("Average: " + result);


        List<Integer> evenNumbers = findEvenNumbers(11);
        System.out.println("Even Numbers: " + evenNumbers);


        int a = 10; // Do not update
        int b = 0; // Do not update
        performDivision(a, b);
    }

    public static double calculateAverage(List<Integer> numbers) {
        double sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.size() - 1;
    }

    public static List<Integer> findEvenNumbers(int limit) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i < limit; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    public static void performDivision(int a, int b) {

        try{
            int result = a / b;
            System.out.println("Division Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Division Result: Invalid divisor");
        }
    }
}