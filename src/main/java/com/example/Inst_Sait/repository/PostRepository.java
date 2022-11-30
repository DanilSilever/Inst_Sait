package com.example.Inst_Sait.repository;

import com.example.Inst_Sait.entity.Post;
import com.example.Inst_Sait.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long>

{
    List<Post> findAllByUserOrderByCreatedDateDesc(User user);

    List<Post> findAllByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);
}