package nomaraless.nomad.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private CalculateService calculateService = new CalculateService();
    @RequestMapping
    public String calculate() {
        return calculateService.calculate();
    }

    @GetMapping(path = "/plus")
    public double plus(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2") String b) {
        return calculateService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public double minus(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b){
        return calculateService.minus(a, b);
    }
    @GetMapping(path = "/multiply")
    public double multyply(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b) {
        return calculateService.multyply(a, b);
    }
    @GetMapping(path = "/divide")
    public double divide(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b) {
        return calculateService.divide(a, b);
    }
}
