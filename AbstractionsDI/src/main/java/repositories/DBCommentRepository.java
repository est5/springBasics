package repositories;

import model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository //explicitly mark responsibility same as @Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
