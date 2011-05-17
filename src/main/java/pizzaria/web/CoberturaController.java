package pizzaria.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzaria.domain.Cobertura;

@RooWebScaffold(path = "coberturas", formBackingObject = Cobertura.class)
@RequestMapping("/coberturas")
@Controller
public class CoberturaController {
}
