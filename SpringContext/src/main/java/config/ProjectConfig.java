package config;

import models.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// stereotype annotations search package
@ComponentScan(basePackages = "models")
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Special parrot");
        return p;
    }

    //to specify instance use method name or annotation
    @Bean("AnnotationName")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Annotation name parrot");
        return p;
    }

    //possible to define instance outside of app
    @Bean
    Integer five() {
        return 5;
    }
}
