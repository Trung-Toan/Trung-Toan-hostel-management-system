package t3h.hostelmanagementsystem.controller.user;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import t3h.hostelmanagementsystem.dto.request.UserDTO;
import t3h.hostelmanagementsystem.service.user.UserService;

@RestController
@RequestMapping("/account")
public class Register {
    private final UserService userService;

    public Register(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserDTO register(@Valid @RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
