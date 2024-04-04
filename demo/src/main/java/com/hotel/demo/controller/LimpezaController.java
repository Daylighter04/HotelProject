package com.hotel.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimpezaController {
    private LimpezaApplication limpezaApplication;

    public LimpezaController(LimpezaApplication limpezaApplication) {
        this.limpezaApplication = limpezaApplication;
    }

    @GetMapping("/api/limpeza/{id}")
    private Limpeza getLimpezaById(@PathVariable long id) throws Exception {
        return limpezaApplication.findById(id);
    }

    private class LimpezaApplication {
        public Limpeza findById(long id) {
            return null;
        }
    }

    private class Limpeza {
    }
}

