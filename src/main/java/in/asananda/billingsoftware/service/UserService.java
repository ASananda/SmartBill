package in.asananda.billingsoftware.service;

import in.asananda.billingsoftware.io.UserRequest;
import in.asananda.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
