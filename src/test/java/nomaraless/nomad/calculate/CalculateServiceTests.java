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
        double expected = 11.0;
        double actual = Integer.parseInt(String.valueOf(service.plus("1.0", "10.0")));
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "5,10,15", "10,20,30"})
    void plusTest1(String num1, String num2, Integer expected) {
        int result = Integer.parseInt((String) service.plus(num1, num2));
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "15,10,5", "30,20,10"})
    void plusTest2(String num1, String num2, Integer expected) {
        int result = Integer.parseInt((String) service.plus(num1, num2));
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "15,10,5", "30,20,10"})
    void minusTest(String num1, String num2, Integer expected) {
        int result = Integer.parseInt((String) service.minus(num1, num2));
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"3,2,6", "15,10,150", "30,20,600"})
    void multiplyTest(String num1, String num2, Integer expected) {
        int result = Integer.parseInt((String) service.multiyply(num1, num2));
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"4,2,2.0", "10,5,2.0", "40,20,2.0"})
    void divideTest(String num1, String num2, Double expected) {
        double result = Double.parseDouble(service.divide(num1, num2).toString());
        assertEquals(expected, result);
    }
}
