package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Comment;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomComment;

@RepositoryRestResource(path = "comment", collectionResourceRel = "commentList", excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
