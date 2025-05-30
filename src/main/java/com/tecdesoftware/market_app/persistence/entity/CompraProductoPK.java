package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.*;

@Embeddable
public class CompraProductoPK {

    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_producto")
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
}
