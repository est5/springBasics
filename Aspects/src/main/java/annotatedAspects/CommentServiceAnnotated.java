package annotatedAspects;

import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentServiceAnnotated {
    private Logger logger = Logger.getLogger(CommentServiceAnnotated.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog
    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }

    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

}
