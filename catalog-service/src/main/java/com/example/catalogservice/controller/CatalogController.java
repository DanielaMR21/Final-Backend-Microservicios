package com.example.catalogservice.controller;

import com.example.catalogservice.entity.CatalogDto;
import com.example.catalogservice.service.CatalogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/{genre}")
    ResponseEntity<CatalogDto> getCatalogByGenre(@PathVariable String genre) {
        log.info("Catalogo buscado con genero {}",genre);
        return ResponseEntity.ok(catalogService.getCatalogByGenre(genre));
    }
}
