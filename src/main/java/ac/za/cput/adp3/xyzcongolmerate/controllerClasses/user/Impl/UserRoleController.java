package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.user.Impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.user.UserRoleInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(value = "/UserRole")
public class UserRoleController implements UserRoleInt {
    @Autowired
    UserRoleServiceImpl userRoleService;

    @PostMapping(value = "/create")
    @Override
    public UserRole create(@RequestBody UserRole userRole) {
        return userRoleService.create(userRole);
    }

    @Override
    public UserRole read(String id) {return null;}

    @PostMapping(value = "/read")
    public UserRole read(@RequestBody UserRole userRole) {
        return userRoleService.read(userRole);
    }

    @PostMapping(value = "/update")
    @Override
    public UserRole update(@RequestBody UserRole userRole) {
        return userRoleService.update(userRole);
    }


    @Override
    public void delete(String s) {}

    @PostMapping(value = "/delete")
    public void delete(@RequestBody UserRole userRole) {

        userRoleService.delete(userRole);
    }

    @GetMapping("/getAll")
    @Override
    public Set<UserRole> getAll() {
        return userRoleService.getAll();
    }
}
