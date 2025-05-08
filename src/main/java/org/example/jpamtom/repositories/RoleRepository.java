package org.example.jpamtom.repositories;

import org.example.jpamtom.entities.Role;
import org.example.jpamtom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
 