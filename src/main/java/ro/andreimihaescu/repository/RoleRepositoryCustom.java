package ro.andreimihaescu.repository;

import ro.andreimihaescu.model.UserRole;

public interface RoleRepositoryCustom {
    UserRole findRoleByUserId(Long userId);
}
