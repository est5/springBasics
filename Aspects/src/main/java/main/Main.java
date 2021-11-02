package main;

import annotatedAspects.CommentServiceAnnotated;
import config.ProjectConfiguration;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = context.getBean(CommentService.class);

/*
        Comment comment = new Comment();
        comment.setAuthor("Author");
        comment.setText("Demo comment");
        String value = service.publishComment(comment);
        logger.info(value);
        service.doSmth();
*/
        var annotatedService = context.getBean(CommentServiceAnnotated.class);
        Comment comment = new Comment();
        comment.setAuthor("Author");
        comment.setText("Demo comment");
//        annotatedService.publishComment(comment);
        annotatedService.editComment(comment);
//        annotatedService.deleteComment(comment);


    }
}
