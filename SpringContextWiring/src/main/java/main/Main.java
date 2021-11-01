package main;


import multipleBeans.*;
import autowired.*;
import config.ProjectConfig;
import models.*;
import models.Parrot;
import models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        models.Person p = context.getBean(models.Person.class);
//        models.Person another = context.getBean(Person.class);
//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println(p.getParrot().getName());
//        var autoContext = new AnnotationConfigApplicationContext(Config.class);
//        autowired.Person autoPerson = autoContext.getBean(autowired.Person.class);
//        System.out.println(autoPerson.getParrot().getName());

        var multiContext = new AnnotationConfigApplicationContext(multipleBeans.Config.class);
        var person = multiContext.getBean(multipleBeans.Person.class);
        System.out.println(person.getParrot());
    }
}
