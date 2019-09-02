package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.OrganisationControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.OrganisationUserControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationService;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationUserService;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/organisationUser")
public class OrganisationUserController implements OrganisationUserControllerInt {
    @Autowired
    OrganisationUserServiceImpl organisationUserService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/create")
    @Override
    public OrganisationUser create(@RequestBody OrganisationUser organisationUser) {
        System.out.println(organisationUser.toString());

        return organisationUserService.create(organisationUser);
    }

    @Override
    public OrganisationUser read(String s) {
        return null;
    }

    @GetMapping("/read")
    public OrganisationUser read(@RequestParam String orgCode, @RequestParam String userEmail ) {
        return organisationUserService.read(orgCode,userEmail);
    }

    @PostMapping("/update")
    @Override
    public OrganisationUser update(@RequestParam OrganisationUser organisationUser) {
        return organisationUserService.update(organisationUser);
    }

    @Override
    public void delete(String s) {

    }


    @GetMapping("/delete")
    public void delete(@RequestParam String orgCode, @RequestParam String userEmail ) {
        organisationUserService.delete(orgCode,userEmail);

    }

    @GetMapping("/getAll")
    @Override
    public Set<OrganisationUser> getAll() {
        return organisationUserService.getAll();
    }
}
