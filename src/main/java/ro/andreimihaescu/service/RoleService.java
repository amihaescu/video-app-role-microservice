package ro.andreimihaescu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.andreimihaescu.dto.RoleRequest;
import ro.andreimihaescu.model.UserRole;
import ro.andreimihaescu.repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public boolean insertRoleForUser(RoleRequest roleRequest) {
        if (roleRepository.findRoleByUserId(roleRequest.getUserId()) == null) {
            roleRepository.save(new UserRole(roleRequest.getUserId(), roleRequest.getRoleType(), roleRequest.getSubscriptionType()));
            return true;
        }
        return false;
    }


}
