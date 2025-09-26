package com.personalProjects.facturacion_prod.dto;

import jakarta.persistence.Transient;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class ResponseFacturaDTO {
    private Integer id;
    private String numeroFactura;
    private BigDecimal subtotal;
    private BigDecimal total;
    private LocalDateTime fechaCreado;
    private Set<ResponseDetalleFacturaDTO> detalleFacturas;
}
