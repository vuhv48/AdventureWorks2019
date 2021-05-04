package edu.fa.AdventureWorkSpringView.model.dao;


import edu.fa.AdventureWorkSpringView.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedStoredProcedureQuery;
import java.util.List;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>, CrudRepository<Department, Integer> {


    @Query("SELECT s FROM Department s order by s.departmentID desc ")
    List<Department> getDepartmentByOrOrderByDepartmentID();


    @Query("SELECT s FROM Department s where s.departmentID = ?1 or s.name like %?2%")
    List<Department> selectAll(Integer departmentID, String name);


    @Query(value = "{call spGetAllDepartment}", nativeQuery = true)
    List<Department> selectAllStoreProc();

    @Query(value = "{call spGetDepartmentByID(?1)}", nativeQuery = true)
    List<Department> selectAllStoreProcByID(Integer departmentID);

    @Query(value = "SELECT * FROM fGetAllDepartment()", nativeQuery = true)
    List<Department> selectAllFunc();

}
