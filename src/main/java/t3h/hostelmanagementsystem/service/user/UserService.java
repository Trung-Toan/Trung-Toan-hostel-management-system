package t3h.hostelmanagementsystem.service.user;

import t3h.hostelmanagementsystem.dto.request.LoginRequestDTO;
import t3h.hostelmanagementsystem.dto.request.UserDTO;

public interface UserService {
    UserDTO loginByAccount(LoginRequestDTO loginRequest);
    UserDTO createUser(UserDTO userDTO);
}