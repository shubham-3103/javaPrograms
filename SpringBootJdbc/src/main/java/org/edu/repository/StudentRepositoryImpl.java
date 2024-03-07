package org.edu.repository;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<Students> findAll() {
		return jdbctemplate.query("Select * from students",
				(rs, rowNumber) -> new Students(rs.getInt("studentId"), rs.getString("studentName")));
	}

	public int save(Students st) {
		return jdbctemplate.update("Insert into students values(?,?,?)", st.getStudentId(), st.getStudentName(),
				st.getAge());
	}

	public int delete(int id) {
		return jdbctemplate.update("DELETE FROM students WHERE studentId = ?", id);
	}

	public int update(Students st) {
		return jdbctemplate.update("UPDATE students SET age = ? WHERE studentId = ?", st.getAge(), st.getStudentId());
	}

	public Optional<Students> findById(int id) {
		return jdbctemplate.queryForObject("Select * from students where studentId = ?", new Object[] {id},
				(rs, rowNumber) -> Optional.of(new Students(rs.getInt("studentId"), rs.getString("studentName"))));
	}

}
