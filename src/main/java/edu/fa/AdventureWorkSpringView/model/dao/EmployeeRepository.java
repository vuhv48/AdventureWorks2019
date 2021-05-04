package edu.fa.AdventureWorkSpringView.model.dao;


import edu.fa.AdventureWorkSpringView.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
