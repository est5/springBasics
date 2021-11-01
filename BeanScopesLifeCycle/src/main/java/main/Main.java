package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

//        var cs1 = context.getBean("commentService", CommentService.class);
//        var cs2 = context.getBean("commentService", CommentService.class);

//        System.out.println(cs1 == cs2);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs = context.getBean(CommentService.class);
        var css = context.getBean(CommentService.class);
        var us = context.getBean(UserService.class);
//        System.out.println(cs.getCommentRepository().hashCode());
//        System.out.println(us.getCommentRepository().hashCode());

    }

}
