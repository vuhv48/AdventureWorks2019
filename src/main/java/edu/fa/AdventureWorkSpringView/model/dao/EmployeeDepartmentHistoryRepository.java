package edu.fa.AdventureWorkSpringView.model.dao;


import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistory;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistoryID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeDepartmentHistoryRepository extends JpaRepository<EmployeeDepartmentHistory, EmployeeDepartmentHistoryID> {


   @Query("SELECT e FROM EmployeeDepartmentHistory e WHERE e.employee2.businessEntityID = ?1")
    List<EmployeeDepartmentHistory> getByBusinessEntityID(Integer businessEntityID);
}
