package com.personalProjects.facturacion_prod.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(
                //1. Se desactiva el CSRF
                csrf-> csrf.disable()
        ).authorizeHttpRequests(
                //2. Se indica como se deben autorizar los request
                auth->{
                    //todas las rutas requieren autentización
                    //auth.anyRequest().authenticated();

                    //todas las uri que coincidan con esta ruta tendran acceso libre, lo demas requiere autorización
                    auth.requestMatchers("/api/v1/productos/**").permitAll()
                            .anyRequest().authenticated();
                }
        //3.Se esperan las credenciales
        ).httpBasic(Customizer.withDefaults());

        //4.Se construye el objeto final
        return httpSecurity.build();
    }
}
