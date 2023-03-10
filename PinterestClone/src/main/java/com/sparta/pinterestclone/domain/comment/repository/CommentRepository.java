package com.sparta.pinterestclone.domain.comment.repository;

import com.sparta.pinterestclone.domain.comment.entity.Comment;
import com.sparta.pinterestclone.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findByIdAndUser(Long id, User user);
}
