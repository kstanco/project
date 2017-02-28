package com.charlie.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charlie.entity.PhotoEntity;

@Repository
public interface GalleryDAO extends JpaRepository<PhotoEntity, Integer>{
  public Page<PhotoEntity> findAllByOrderByTimestampDesc(Pageable pageable);
}
