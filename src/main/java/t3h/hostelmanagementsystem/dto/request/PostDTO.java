package t3h.hostelmanagementsystem.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private Long id;

    @NotNull(message = "POST_USER_NULL")
    private UserDTO user;

    @NotNull(message = "POST_HOSTEL_NULL")
    private HostelDTO hostel;

    @NotBlank(message = "POST_TITLE_BLANK")
    @Size(max = 255, message = "POST_TITLE_SIZE")
    private String title;

    @NotBlank(message = "POST_CONTENT_BLANK")
    @Size(max = 5000, message = "POST_CONTENT_SIZE")
    private String content;

    @NotNull(message = "POST_STATUS_NULL")
    private Integer status;

    private LocalDateTime createdAt; // Không validate
    private LocalDateTime updatedAt; // Không validate
}