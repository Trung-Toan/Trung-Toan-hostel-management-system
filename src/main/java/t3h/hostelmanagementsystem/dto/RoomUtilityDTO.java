package t3h.hostelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomUtilityDTO {
    @NotNull(message = "Room ID cannot be null")
    private Long roomId;

    @NotNull(message = "Utility ID cannot be null")
    private Long utilityId;

    @NotNull(message = "Room cannot be null")
    private RoomDTO room;

    @NotNull(message = "Utility cannot be null")
    private UtilityDTO utility;
}