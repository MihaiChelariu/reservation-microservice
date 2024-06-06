package org.chelariulicenta.rezervation.config;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Mapper mapper() {
        return DozerBeanMapperBuilder
                .create()
                .withCustomConverter(new LocalDateConverter())
                .build();
    }
}
