package features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());

       // evenNumbers.forEach(System.out::println);  // Output: 2, 4, 6
        evenNumbers.forEach(n-> System.out.println(n ));
    }
}


//