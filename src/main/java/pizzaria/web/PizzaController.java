package pizzaria.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzaria.domain.Pizza;

@RooWebScaffold(path = "pizzas", formBackingObject = Pizza.class)
@RequestMapping("/pizzas")
@Controller
public class PizzaController {
}
