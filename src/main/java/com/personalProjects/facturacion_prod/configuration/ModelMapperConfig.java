package com.personalProjects.facturacion_prod.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    //Bean manual, que gestiona spring y lo inyecta en tiempo de compilación
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
