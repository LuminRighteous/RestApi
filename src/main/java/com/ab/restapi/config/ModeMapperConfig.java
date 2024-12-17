package com.ab.restapi.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModeMapperConfig {
    @Bean
    public ModelMapper modelMapper(){

        return new ModelMapper();
    }
}
