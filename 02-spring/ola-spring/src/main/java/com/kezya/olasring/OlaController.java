package com.kezya.olasring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/")
    public String ola() {
        return "Olá, mundo!";
    }

    @GetMapping("/ola/{nome}")
    public String olaNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        return "Soma: " + (a + b);
    }
}
