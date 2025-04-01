package t3h.hostelmanagementsystem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import t3h.hostelmanagementsystem.dto.CategoryDTO;
import t3h.hostelmanagementsystem.dto.RoomDTO;
import t3h.hostelmanagementsystem.entity.Category;
import t3h.hostelmanagementsystem.entity.Room;

@Mapper(componentModel = "spring")
public interface RoomMapper {
    @Mapping(target = "category", source = "category")
    RoomDTO toRoomDTO(Room room);

    @Mapping(target = "hostel", ignore = true) // Bỏ qua hostel vì RoomDTO không có HostelDTO
    Room toRoomEntity(RoomDTO roomDTO);

    CategoryDTO toCategoryDTO(Category category);
}