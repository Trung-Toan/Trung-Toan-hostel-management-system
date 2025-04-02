package t3h.hostelmanagementsystem.controller.user;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import t3h.hostelmanagementsystem.dto.request.LoginRequestDTO;
import t3h.hostelmanagementsystem.dto.request.UserDTO;
import t3h.hostelmanagementsystem.dto.response.ApiResponse;
import t3h.hostelmanagementsystem.entity.User;
import t3h.hostelmanagementsystem.service.user.UserService;

@RestController
@RequestMapping("/")
public class Login {
    private final UserService userService;
    public Login(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ApiResponse<UserDTO> login(@RequestBody @Valid LoginRequestDTO loginRequestDTO) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setResult(userService.loginByAccount(loginRequestDTO));
        return apiResponse;
    }
}
