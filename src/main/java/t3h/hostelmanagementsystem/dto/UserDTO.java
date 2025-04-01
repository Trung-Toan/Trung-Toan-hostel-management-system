package t3h.hostelmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;
import t3h.hostelmanagementsystem.validation.email.ValidEmail;
import t3h.hostelmanagementsystem.validation.phoneNumber.ValidPhoneNumber;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Full name cannot be blank")
    @Size(max = 255, message = "Full name cannot exceed 255 characters")
    private String fullName;

    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    @NotBlank(message = "Email cannot be blank")
    @ValidEmail
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    @ValidPhoneNumber
    private String phoneNumber;

    @NotNull(message = "Date of birth cannot be null")
    @Past(message = "Date of birth must be in the past")
    @AssertTrue(message = "User must be at least 16 years old")
    public boolean isDobValid() {
        return dob != null && LocalDate.now().minusYears(16).isAfter(dob);
    }
    private LocalDate dob;

    @Size(max = 500, message = "Address cannot exceed 500 characters")
    private String address;

    @Size(max = 255, message = "Avatar URL cannot exceed 255 characters")
    private String avatar;

    @NotBlank(message = "Role cannot be blank")
    @Pattern(regexp = "customer|manager|owner", message = "Role must be 'customer', 'manager', or 'owner'")
    private String role;

    @NotNull(message = "Status cannot be null")
    private Byte status;

    private LocalDateTime createdAt; // Không validate
    private LocalDateTime updatedAt; // Không validate
}