package pizzaria.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzaria.domain.Massa;

@RooWebScaffold(path = "massas", formBackingObject = Massa.class)
@RequestMapping("/massas")
@Controller
public class MassaController {
}
