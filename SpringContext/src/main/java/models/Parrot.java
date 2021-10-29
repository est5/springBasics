package models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//stereotype annotation
@Component("component")
@Primary
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Default name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
