package edu.fa.AdventureWorkSpringView.model.mapping;


import edu.fa.AdventureWorkSpringView.model.dto.ShiftDTO;
import edu.fa.AdventureWorkSpringView.model.entity.Shift;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;


@Service
@Mapper(componentModel = "spring")
public interface ShiftMapper {

    @Mapping(source = "shiftID", target = "shiftID", numberFormat = "#.##")
    @Mapping(source = "startTime", target = "startTime", dateFormat = "hh:mm:ss")
    @Mapping(source = "endTime", target = "endTime", dateFormat = "hh:mm:ss")
    @Mapping(source = "shift.modifiedDate", target = "modifiedDate",dateFormat = "dd/MM/yyyy")
    ShiftDTO toDTO(Shift shift);
}
