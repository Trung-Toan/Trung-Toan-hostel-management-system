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
public class RoomDTO {
    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotNull(message = "Category cannot be null")
    private CategoryDTO category;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 255, message = "Name cannot exceed 255 characters")
    private String name; // Tên không trùng trong cùng hostel sẽ kiểm tra trong service

    @NotNull(message = "Price cannot be null")
    @Min(value = 0, message = "Price must be non-negative")
    private Double price;

    @NotNull(message = "Area cannot be null")
    @Min(value = 1, message = "Area must be greater than 0")
    private Integer area;

    @NotNull(message = "Max occupants cannot be null")
    @Min(value = 1, message = "Max occupants must be at least 1")
    private Integer maxOccupants;

    @NotNull(message = "Current occupants cannot be null")
    @Min(value = 0, message = "Current occupants cannot be negative")
    private Integer currentOccupants;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    @NotNull(message = "Status cannot be null")
    private Byte status;

    private LocalDateTime createdAt; // Không validate
    private LocalDateTime updatedAt; // Không validate
}