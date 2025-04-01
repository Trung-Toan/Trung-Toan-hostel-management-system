package t3h.hostelmanagementsystem.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import t3h.hostelmanagementsystem.dto.CategoryDTO;
import t3h.hostelmanagementsystem.dto.HostelDTO;
import t3h.hostelmanagementsystem.dto.RoomDTO;
import t3h.hostelmanagementsystem.dto.UserDTO;
import t3h.hostelmanagementsystem.entity.Category;
import t3h.hostelmanagementsystem.entity.Hostel;
import t3h.hostelmanagementsystem.entity.Room;
import t3h.hostelmanagementsystem.entity.User;

@Mapper(componentModel = "spring")
public interface HostelMapper {
    @Mapping(target = "rooms", source = "rooms")
    @Mapping(target = "owner", source = "owner")
    @Mapping(target = "manager", source = "manager")
    HostelDTO toHostelDTO(Hostel hostel);

    @InheritInverseConfiguration
    Hostel toHostel(HostelDTO hostelDTO);

    @Mapping(target = "category", source = "category")
    RoomDTO toRoomDTO(Room room);

    @InheritInverseConfiguration
    Room toRoom(RoomDTO roomDTO);

    UserDTO toUserDTO(User user);

    @InheritInverseConfiguration
    User toUser(UserDTO userDTO);

    CategoryDTO toCategoryDTO(Category category);

    @InheritInverseConfiguration
    Category toCategory(CategoryDTO categoryDTO);
}
