package com.example.Inst_Sait.repository;

import com.example.Inst_Sait.entity.ImgModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository <ImgModel, Long>
{
    Optional<ImgModel> findByUserId (Long id);

    Optional<ImgModel> findByPostId (Long id);
}
