package com.charlie.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charlie.entity.BlogPostEntity;

@Repository
public interface BlogDAO extends JpaRepository<BlogPostEntity, Integer> {
	public Page<BlogPostEntity> findAllByOrderByTimestampDesc(Pageable pageable);
}