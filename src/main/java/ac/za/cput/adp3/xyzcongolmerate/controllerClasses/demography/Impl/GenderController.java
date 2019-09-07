package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.demography.Impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.demography.GenderControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.GenderService;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.impl.GenderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(value = "/gender")
public class GenderController implements GenderControllerInt {
    @Autowired
    GenderServiceImpl genderServiceImpl;

    @PostMapping("/create")
    @Override
    public Gender create(@RequestBody Gender gender) {
        return genderServiceImpl.create(gender);
    }

    @GetMapping("/read")
    @Override
    public Gender read(@RequestParam("id") String id) {
        return genderServiceImpl.read(id);
    }

    @PostMapping("update")
    @Override
    public Gender update(@RequestBody Gender gender) {
        return genderServiceImpl.update(gender);
    }

    @GetMapping("delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        genderServiceImpl.delete(id);
    }

    @GetMapping("getAll")
    @Override
    public Set<Gender> getAll() {
        return null;
    }
}
