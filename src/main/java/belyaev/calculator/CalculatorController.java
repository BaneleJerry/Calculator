package belyaev.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/add")
    public String getSymbol(@RequestParam(name = "s") String symbol, Model model) {
        model.addAttribute("symbol", symbol);
        System.out.println(symbol);
        return "index";
    }

}
