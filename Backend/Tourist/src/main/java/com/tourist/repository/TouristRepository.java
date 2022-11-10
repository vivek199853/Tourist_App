package com.tourist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tourist.entity.Tourist;

@Repository
@CrossOrigin("http://localhost:4200")
public interface TouristRepository extends JpaRepository<Tourist, Integer> {
    @Query("SELECT guest FROM Tourist guest ORDER BY guest.firstName DESC")
	public List<Tourist> findAll();

}
