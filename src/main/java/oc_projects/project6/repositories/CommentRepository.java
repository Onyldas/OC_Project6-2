package oc_projects.project6.repositories;

import oc_projects.project6.entities.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
