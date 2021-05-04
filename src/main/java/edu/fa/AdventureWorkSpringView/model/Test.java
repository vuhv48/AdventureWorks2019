package edu.fa.AdventureWorkSpringView.model;


import edu.fa.AdventureWorkSpringView.model.entity.Department;
import edu.fa.AdventureWorkSpringView.model.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Test {




    public static void main(String[] args) {


        Department department = new Department();
        department.setName("aaa");
        department.setGroupName("group aaaa");
        department.setModifiedDate(new Date());
        DepartmentService service = new DepartmentService();

        service.getAll().stream().forEach(o1-> System.out.println(o1));
       // service.saveAndFlush(department);
    }
}
