import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Let's perform some calculus!");
            System.out.println("Please introduce the first fractional number: ");

            Scanner scanner = new Scanner(System.in);
            double number1 = scanner.nextDouble();

            System.out.println("Please introduce the second fractional number: ");
            double number2 = scanner.nextDouble();

        double multiplicationResult = multiplication (number1, number2);
        double additionResult = addition (number1, number2);
        double substractionResult = substraction (number1, number2);
        double divisionResult = division (number1,number2);
        double remainderResult = remainder ((int) number1,(int)number2);
        double randomNumber = generateRandomNumber (substractionResult, multiplicationResult);

        System.out.println("The multiplication result is: " + multiplicationResult);
        System.out.println("The addition result is: " + additionResult);
        System.out.println("The substraction result is: " + substractionResult);
        System.out.println("The division result is: " + divisionResult);
        System.out.println("The remainder is: " + remainderResult);
        System.out.println("The random number between " +substractionResult + " and " + multiplicationResult+" is: " + randomNumber);
        }
        public static double multiplication (double nr1, double nr2) {
        double result = nr1 * nr2;
        return result;
        }

        public static Double addition (double nr1, double nr2) {
        double result = nr1 + nr2;
        return result;
        }

        public static double substraction (Double nr1, Double nr2) {
        Double result = nr1 - nr2;
        return result;
        }

        public static Double division (Double nr1, double nr2){
        return nr1 / nr2;
        }

        public static int remainder (int nr1, Integer nr2) {
        return nr1 % nr2;
        }
        public static double generateRandomNumber (double min, double max){
return Math.random()*(max-min) + min;

}
}