package com.hotel.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecepcionistaController {
    private final RecepcionistaApplication recepcionistaApplication;

    private RecepcionistaController(RecepcionistaApplication recepcionistaApplication) {
        this.recepcionistaApplication = recepcionistaApplication;
    }

    @GetMapping("/api/recepcionista/{id}")
    private Recepcionista getRecepcionistaById(@PathVariable long id) throws Exception {
        return recepcionistaApplication.findById(id);
    }

    private static class RecepcionistaApplication {
        public Recepcionista findById(long id) {
            return null;
        }
    }

    private static class Recepcionista {
    }
}