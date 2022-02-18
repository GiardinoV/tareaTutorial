package com.books.integrate.spring.react.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.books.integrate.spring.react.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

	List<Tutorial> findByTitleContaining(String title);
	List<Tutorial> findByPublished(boolean published);
	ArrayList<Tutorial> findByPrice(float price);
}
