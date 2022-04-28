package com.example.catalogservice.service;

import com.example.catalogservice.entity.CatalogDto;

public interface CatalogService {
    CatalogDto getCatalogByGenre(String genre);

}
