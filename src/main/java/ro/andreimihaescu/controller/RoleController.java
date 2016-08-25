package ro.andreimihaescu.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.andreimihaescu.dto.RoleRequest;
import ro.andreimihaescu.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private static final Logger LOGGER = Logger.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Boolean addRoleForUser(@RequestBody RoleRequest roleRequest) {
        LOGGER.info(String.format("Attempting to create user role for user id %d", roleRequest.getUserId()));
        return roleService.insertRoleForUser(roleRequest);
    }
}
