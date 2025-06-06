package com.tecdesoftware.market_app.persistence;

import com.tecdesoftware.market_app.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market_app.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();

    }

}


