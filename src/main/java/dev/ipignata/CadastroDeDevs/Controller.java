package dev.ipignata.CadastroDeDevs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Pignata
 */

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/teste")
    public String teste(){
        return "Teste";
    }

}