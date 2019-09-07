package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.role.impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.role.RoleControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.service.misc.RoleService;
import ac.za.cput.adp3.xyzcongolmerate.service.misc.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/role")
public class RoleController implements RoleControllerInt {
    @Autowired
    RoleServiceImpl roleService;
    @PostMapping("/create")
    @Override
    public Role create(@RequestBody Role role) {
        return roleService.create(role);
    }

    @GetMapping("/read")
    @Override
    public Role read(@RequestParam(value = "id") String id) {
        return roleService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Role update(@RequestBody Role role) {
        return roleService.update(role);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        roleService.delete(id);
    }

    @GetMapping("/getAll")
    @Override
    public Set<Role> getAll() {
        return roleService.getAll();
    }
}
