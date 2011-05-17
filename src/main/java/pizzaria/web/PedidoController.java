package pizzaria.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzaria.domain.Pedido;

@RooWebScaffold(path = "pedidoes", formBackingObject = Pedido.class, delete=false, update=false)
@RequestMapping("/pedidoes")
@Controller
public class PedidoController {
}
