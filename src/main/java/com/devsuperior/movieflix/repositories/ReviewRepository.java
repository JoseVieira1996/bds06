package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	@Query("SELECT obj FROM Review obj WHERE "
	        + "(obj.user = :user) AND "
	        + "(obj.movie.id = :id) ")
	List<Review> find(User user, Long id);
}
