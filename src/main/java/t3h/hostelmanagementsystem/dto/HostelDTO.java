package t3h.hostelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HostelDTO {
    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 255, message = "Name cannot exceed 255 characters")
    private String name; // Tên không trùng sẽ kiểm tra trong service/repository

    @NotBlank(message = "Address cannot be blank")
    @Size(max = 500, message = "Address cannot exceed 500 characters")
    private String address;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    @NotNull(message = "Owner cannot be null")
    private UserDTO owner;

    private UserDTO manager; // Manager có thể null

    @NotNull(message = "Status cannot be null")
    private Byte status;

    private LocalDateTime createdAt; // Không cần validate vì tự động tạo
    private LocalDateTime updatedAt; // Không cần validate vì tự động tạo

    private List<RoomDTO> rooms; // Không validate ở đây, sẽ kiểm tra trong RoomDTO
}