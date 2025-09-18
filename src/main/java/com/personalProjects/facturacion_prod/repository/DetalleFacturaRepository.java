package com.personalProjects.facturacion_prod.repository;

import com.personalProjects.facturacion_prod.model.DetalleFactura;
import com.personalProjects.facturacion_prod.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository <DetalleFactura, Integer>{
}
