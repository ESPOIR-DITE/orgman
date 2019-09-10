package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.user.Impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.user.UserInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(value = "userdemography")
public class UserDemographyController implements UserInt {
    @Autowired
    UserServiceImpl userService;
    @PostMapping(value = "/create")
    @Override
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping(value = "/read")
    @Override
    public User read(@RequestParam(value = "id") String id) {
        return userService.read(id);
    }

    @PostMapping(value = "/update")
    @Override
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @GetMapping(value = "/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        userService.delete(id);
    }

    @GetMapping(value = "/getAll")
    @Override
    public Set<User> getAll() {
        return userService.getAll();
    }
}
