package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
//with prototype scope spring creates new inst every request to a reference
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//Lazy creates inst only when needed not whenever context created , cause perf issues cuz of checking
// if inst already exists
@Lazy
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentService() {
        System.out.println("Comment service created");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
