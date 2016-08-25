package ro.andreimihaescu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.andreimihaescu.model.UserRole;


public interface RoleRepository extends JpaRepository<UserRole, Long>, RoleRepositoryCustom{
}
