package com.personalProjects.facturacion_prod.controller;

import com.personalProjects.facturacion_prod.dto.ProductoDTO;
import com.personalProjects.facturacion_prod.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
@Slf4j
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    //Crear producto
    @PostMapping
    public ResponseEntity<ProductoDTO> save(@RequestBody ProductoDTO productoDTO){
        log.info("Informacion productoDTO {}",productoDTO);
        return new ResponseEntity<>(productoService.save(productoDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> findAll(){
        List<ProductoDTO> productoDTOS = productoService.findAll();
        if(productoDTOS.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productoDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> findById(@PathVariable Integer id){
        return productoService.findById(id).map(
                /*productoDTO -> {
                    return ResponseEntity.ok(productoDTO);
                }*/
                //Versión optimizada
                ResponseEntity::ok
        ).orElseGet(()->ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        if(productoService.deleteById(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();

    }

    public ResponseEntity<ProductoDTO> update(@RequestBody ProductoDTO productoDTO){
        return productoService.update(productoDTO).map(
                ResponseEntity::ok
        ).orElseGet(
                ()-> ResponseEntity.notFound().build()
        );
    }

}
