package config;

import aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"services", "annotatedAspects"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
