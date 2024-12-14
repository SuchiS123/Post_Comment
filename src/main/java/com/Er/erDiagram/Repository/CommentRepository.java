package com.Er.erDiagram.Repository;

import com.Er.erDiagram.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}