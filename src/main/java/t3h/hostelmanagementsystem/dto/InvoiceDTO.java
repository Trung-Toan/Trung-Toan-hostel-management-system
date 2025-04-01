package t3h.hostelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDTO {
    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotNull(message = "Room cannot be null")
    private RoomDTO room;

    @NotNull(message = "Customer cannot be null")
    private UserDTO customer;

    @NotBlank(message = "Month cannot be blank")
    @Size(min = 7, max = 7, message = "Month must be in format 'YYYY-MM'")
    private String month;

    @NotNull(message = "Room price cannot be null")
    @Min(value = 0, message = "Room price must be non-negative")
    private Double roomPrice;

    @NotNull(message = "Electricity usage cannot be null")
    @Min(value = 0, message = "Electricity usage cannot be negative")
    private Integer electricityUsage;

    @NotNull(message = "Electricity price cannot be null")
    @Min(value = 0, message = "Electricity price must be non-negative")
    private Double electricityPrice;

    @NotNull(message = "Water usage cannot be null")
    @Min(value = 0, message = "Water usage cannot be negative")
    private Integer waterUsage;

    @NotNull(message = "Water price cannot be null")
    @Min(value = 0, message = "Water price must be non-negative")
    private Double waterPrice;

    @NotNull(message = "Utility fee cannot be null")
    @Min(value = 0, message = "Utility fee must be non-negative")
    private Double utilityFee;

    @NotNull(message = "Total amount cannot be null")
    @Min(value = 0, message = "Total amount must be non-negative")
    private Double totalAmount;

    @NotNull(message = "Status cannot be null")
    private Byte status;

    private LocalDateTime createdAt; // Không validate
    private LocalDateTime updatedAt; // Không validate
}