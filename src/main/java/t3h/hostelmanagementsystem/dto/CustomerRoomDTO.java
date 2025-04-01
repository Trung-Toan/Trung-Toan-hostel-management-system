package t3h.hostelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRoomDTO {
    @NotNull(message = "Customer ID cannot be null")
    private Long customerId;

    @NotNull(message = "Room ID cannot be null")
    private Long roomId;

    @NotNull(message = "Customer cannot be null")
    private UserDTO customer;

    @NotNull(message = "Room cannot be null")
    private RoomDTO room;

    @NotNull(message = "Start date cannot be null")
    @PastOrPresent(message = "Start date must be in the past or present")
    private LocalDate startDate;

    @FutureOrPresent(message = "End date must be in the present or future")
    private LocalDate endDate;

    @NotNull(message = "Status cannot be null")
    private Byte status;
}