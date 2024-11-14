package com.quietcolossus.padlockd.services;

import com.quietcolossus.padlockd.dtos.UserDto;
import com.quietcolossus.padlockd.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDto getUserById(Long id);
}
