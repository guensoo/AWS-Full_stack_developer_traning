package com.korea.page.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.korea.page.model.PageEntity;

public interface PageRepository extends JpaRepository<PageEntity, Integer>{
	Optional<PageEntity> findById(String id);
}
