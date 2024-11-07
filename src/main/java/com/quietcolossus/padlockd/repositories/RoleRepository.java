package com.quietcolossus.padlockd.repositories;

import com.quietcolossus.padlockd.models.Role;
import com.quietcolossus.padlockd.models.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(RoleEnum roleName);
}
