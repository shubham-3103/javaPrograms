package org.edu.repository;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;

public interface StudentRepository {
	List<Students> findAll();
	int save(Students st);
	int delete(int id);
	int update(Students st);
	 Optional<Students> findById(int id);
}
