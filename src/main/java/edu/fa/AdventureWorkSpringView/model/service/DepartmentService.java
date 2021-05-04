package edu.fa.AdventureWorkSpringView.model.service;


import edu.fa.AdventureWorkSpringView.model.dao.DepartmentRepository;
import edu.fa.AdventureWorkSpringView.model.dto.DepartmentDTO;
import edu.fa.AdventureWorkSpringView.model.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;



    public List<Department> getAll() {
        return repository.findAll();
    }

   public List<Department> selectAll(Integer departmentID, String name){
        return repository.selectAll(departmentID,name);
   }

   public List<Department> getDepartmentByOrOrderByDepartmentID(){
        return repository.getDepartmentByOrOrderByDepartmentID();
   }

   public void deleteByDepartmentID(Integer departmentID){
        repository.deleteById(departmentID);
   }

   public Department saveAndFlush(Department department){
        return repository.saveAndFlush(department);
   }


   public List<Department> selectAllStoreProc(){
        return repository.selectAllStoreProc();
   }

    public List<Department> selectAllStoreProcByID(Integer departmentID){
        return repository.selectAllStoreProcByID(departmentID);
    }

    public List<Department> selectAllFunc(){
        return repository.selectAllFunc();
    }

}
