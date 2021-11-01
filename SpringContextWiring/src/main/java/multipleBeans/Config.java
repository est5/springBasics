package multipleBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@ComponentScan(basePackages = "multipleBeans")
@Configuration
public class Config {
    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Joko");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Mik");
        return p;
    }
    @Bean
    @Primary
    public Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("Main");
        return p;
    }
    //Qualifier specifies which bean call without relying on identifier
//    @Bean
//    public Person person(@Qualifier("parrot2") Parrot p){
//        Person person = new Person();
//        person.setName("123");
//        person.setParrot(p);
//        return person;
//    }
}
