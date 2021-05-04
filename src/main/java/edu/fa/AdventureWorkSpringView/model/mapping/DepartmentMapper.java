package edu.fa.AdventureWorkSpringView.model.mapping;


import edu.fa.AdventureWorkSpringView.model.dto.DepartmentDTO;
import edu.fa.AdventureWorkSpringView.model.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    //DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
    @Mapping(source = "departmentID", target = "departmentID", numberFormat = "#.##")
    @Mapping(source = "modifiedDate", target = "modifiedDate", dateFormat = "dd/MM/yyyy")
    DepartmentDTO toDTO(Department department);

}
