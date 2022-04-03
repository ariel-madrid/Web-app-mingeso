package com.table.or;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class Tabla {
    
    @GetMapping
    public String imprimir()
    {
        String msg = new String("Ya fue mostrada la tabla en la pagina principal XD");
        return msg;
    }

}
