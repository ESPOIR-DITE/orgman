package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.OrganisationControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(value = "/organisation")
public class OrganisationController implements OrganisationControllerInt {

    @Autowired
    OrganisationServiceImpl organisationService;


    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/create")
    @Override
    public Organisation create(@RequestBody Organisation organisation) {
        System.out.println("we are in");
        return organisationService.create(organisation);
    }

    @Override
    @GetMapping("/read")

    public Organisation read(@RequestParam(value = "id") String id) {
        System.out.println("we are reading");
        System.out.println(organisationService.read(id).toString());
        return organisationService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Organisation update(@RequestBody Organisation organisation) {
        return organisationService.update(organisation);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id")String id) {

        organisationService.delete(id);
    }

    @GetMapping(value = "/getAll")
    @Override
    public Set<Organisation> getAll() {
        return organisationService.getAll();
    }
}
