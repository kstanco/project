package com.charlie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charlie.entity.PhotoEntity;

@Repository
public interface GalleryDAO extends JpaRepository<PhotoEntity, Integer>{
  public List<PhotoEntity> findAll(); 
}
