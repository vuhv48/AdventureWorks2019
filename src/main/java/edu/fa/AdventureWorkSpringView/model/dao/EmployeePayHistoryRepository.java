package edu.fa.AdventureWorkSpringView.model.dao;


import edu.fa.AdventureWorkSpringView.model.entity.EmployeePayHistory;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeePayHistoryID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePayHistoryRepository extends JpaRepository<EmployeePayHistory, EmployeePayHistoryID> {

}
