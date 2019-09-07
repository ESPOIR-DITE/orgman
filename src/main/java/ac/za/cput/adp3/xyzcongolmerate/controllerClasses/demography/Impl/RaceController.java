package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.demography.Impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.demography.RaceControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.impl.RaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/race")
public class RaceController implements RaceControllerInt {
    @Autowired
    RaceServiceImpl raceServiceImpl;


    @PostMapping(value = "/create")
    @Override
    public Race create(@RequestBody Race race) {
        return raceServiceImpl.create(race);
    }

    @GetMapping(value = "/read")
    @Override
    public Race read(@RequestParam("id") String id) {
        return raceServiceImpl.read(id);
    }

    @PostMapping("/update")
    @Override
    public Race update(@RequestBody Race race) {
        return raceServiceImpl.update(race);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        raceServiceImpl.delete(id);
    }

    @GetMapping("/getAll")
    @Override
    public Set<Race> getAll() {
        return raceServiceImpl.getAll();
    }
}
