package config;

import models.Parrot;
import models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("ParrotName");
        return parrot;
    }

    @Bean
    public Person person() {
        var person = new Person();
        person.setName("PersonName");
        //person.setParrot(parrot);
        //direct wire
        //person.setParrot(this.parrot());
        return person;

    }
}
