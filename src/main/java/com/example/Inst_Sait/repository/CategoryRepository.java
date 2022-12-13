package com.example.Inst_Sait.repository;

import com.example.Inst_Sait.entity.Category;
import com.example.Inst_Sait.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByPost (Post post);
}
