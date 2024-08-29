package basics;
import java.util.ArrayList;
import java.util.List;
public class Prime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(7);
        numbers.add(9);
        numbers.add(13);
        for (Integer number : numbers) {
            if (prime.isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
