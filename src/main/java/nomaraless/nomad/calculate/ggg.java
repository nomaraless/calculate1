package nomaraless.nomad.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.util.StringUtils;

import java.io.Serializable;

import static org.apache.coyote.http11.Constants.a;

public class ggg {
    public static Serializable plus(String a, String b) {
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x + y;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(plus("1", "10"));
    }

}

