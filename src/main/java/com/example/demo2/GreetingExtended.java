package com.example.demo2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

/*Scrivi una applicazione web Spring Boot che alla endpoint GET v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON formato cosi:

{
    "nome": "Giuseppe",
    "provincia": "Lombardia",
    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
}*/

public class GreetingExtended {
@GetMapping(path = "/ciao/Lombardia")
    public PersonInfo ciao(@RequestParam String province,
                            @RequestParam String name){
    return new PersonInfo(name, province);
    }
}
