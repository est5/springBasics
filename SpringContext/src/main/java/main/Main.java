package main;

import config.ProjectConfig;
import models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // .class to get info about class without instance(getClass() opposite)

        var config = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot defaultParrot = config.getBean(Parrot.class);

        //beans
        Parrot beanParrotMethodName = config.getBean("parrot", Parrot.class);
        Parrot beanParrotName = config.getBean("AnnotationName", Parrot.class);

        //manual , can be used with conditions
        Parrot parrot = new Parrot();
        Supplier<Parrot> parrotSupplier = () -> parrot;
        //last parameter customization
        config.registerBean("parrot2", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
        System.out.println(config.getBean("parrot2", Parrot.class).getName());

    }


}
