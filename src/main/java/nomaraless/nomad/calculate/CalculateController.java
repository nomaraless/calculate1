package nomaraless.nomad.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private CalculateService calculateService;
    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @RequestMapping
    public String calculate() {
        return calculateService.calculate();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2") String b) {
        return calculateService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b){
        return calculateService.minus(a, b);
    }
    @GetMapping(path = "/multiply")
    public String multyply(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b) {
        return calculateService.multyply(a, b);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) String a, @RequestParam(value = "num2", required = false) String b) {
        return calculateService.divide(a, b);
    }
}
