package com.yakunin.instazoo.repository;

import com.yakunin.instazoo.entity.Comment;
import com.yakunin.instazoo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost(Post post);

    Optional<Comment> findByIdAndUserId(Long commentId, Long userId);

}
