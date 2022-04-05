import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multyply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    // Проверяем y на ноль, в случае если ноль проводим хитрое выражение, которое
    // позволяем делить на ноль, т.к. если делить на 0 будет 0. Так же как и 0 делить на любое
    // другое число будет 0
    //(x, y) -> y != 0 ? x / y : ((x / (y + 1)) / x) - 1;


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
