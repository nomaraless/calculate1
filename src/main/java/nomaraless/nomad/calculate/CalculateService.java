package nomaraless.nomad.calculate;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@Service
public class CalculateService {
    public String calculate() {
        return "Добро пожаловать в калькулятор. Введите значения";
    }
    public Serializable plus(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return ("Отсутствуют данные");;
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x + y;
        return c;
    }

    public Serializable minus(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return "Отсутствуют данные";
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x - y;
        return c;
    }
    public Serializable multiyply(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return "Отсутствуют данные";
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return c;
    }
    public Serializable divide(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)){
            return "Отсутствуют данные";
        }
        if (a.equals("0") || b.equals("0")) {
            throw new illegalArgumentException();
        }

        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x / y;
        return c;
    }
}
