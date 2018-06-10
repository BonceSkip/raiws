package cl.tresit.rai;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Bonceskip on 08-06-2018.
 */
@RestController
@RequestMapping("/empleado")
public class ControllerEmpleado {

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public String logInicioAbono(HttpServletRequest request) {
        return "Hello world!";
    }
}
