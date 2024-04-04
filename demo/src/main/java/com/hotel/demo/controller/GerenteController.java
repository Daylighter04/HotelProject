package com.hotel.demo.controller;

import com.hotel.demo.model.Gerente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GerenteController {
    private final GerenteApplication gerenteApplication;

    public GerenteController(GerenteApplication gerenteApplication) {
        this.gerenteApplication = gerenteApplication;
    }

    @GetMapping("/api/gerente/{id}")
    public Gerente getGerenteById(@PathVariable long id) throws Exception {
        return gerenteApplication.findById(id);
    }

    private class GerenteApplication {
        public Gerente findById(long id) {
            return null;
        }
    }
}