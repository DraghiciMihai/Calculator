import com.sda.testing.Calculator;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testCalculator() {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4, 7));
        System.out.println(calc.substract(8, 5));
        System.out.println(calc.multiply(5, 8));
    }

    @Test(expected = ArithmeticException.class)
    public void throwExceptionWhenDividingBy0() {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(8, 0));
    }
}
