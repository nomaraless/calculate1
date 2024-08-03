package nomaraless.nomad.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceTests {
    private CalculateService service = new CalculateService();

    @Test
    public void plusTest() {
        String a = "1";
        String b = "10";
        double expected = 11.0;
        double actual = (double) service.plus(a, b);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "5,10,15", "10,20,30"})
    void plusTest1(String num1, String num2, int expected) {
        double result = (double) service.plus(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "15,10,5", "30,20,10"})
    void minusTest(String num1, String num2, int expected) {
        double result = (double) service.minus(num1, num2);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"3,2,6", "15,10,150", "30,20,600"})
    void multiplyTest(String num1, String num2, int expected) {
        double result = (double) service.multiyply(num1, num2);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"4,2,2.0", "10,5,2.0", "40,20,2.0"})
    void divideTest(String num1, String num2, Double expected) {
        double result = Double.parseDouble(service.divide(num1, num2).toString());
        assertEquals(expected, result);
    }
}
