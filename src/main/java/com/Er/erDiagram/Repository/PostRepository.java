package com.Er.erDiagram.Repository;

import com.Er.erDiagram.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
  }