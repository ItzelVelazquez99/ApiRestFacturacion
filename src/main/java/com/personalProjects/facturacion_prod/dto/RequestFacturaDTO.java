package com.personalProjects.facturacion_prod.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
@Setter
@Getter
public class RequestFacturaDTO {
    private Integer id;
    private String numeroFactura;
    private Set<RequestDetalleFacturaDTO> detalleFacturas;

}
