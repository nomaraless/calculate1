package nomaraless.nomad.calculate;

import org.springframework.util.StringUtils;

public class CalculateService {
    public String calculate() {
        return "Добро пожаловать в калькулятор. Введите значения";
    }
    public double plus(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) System.out.println("nnn");;
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return c;
    }

    public double minus(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) System.out.println("nnn");
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return c;
    }
    public double multyply(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) throw new RuntimeException("Отсутствуют данные");
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return c;
    }
    public double divide(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) throw new RuntimeException("Отсутствуют данные");
        if (a == "0" || b == "0") {
            System.out.println("на наль делить нельзя");
        }
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return c;
    }
}
