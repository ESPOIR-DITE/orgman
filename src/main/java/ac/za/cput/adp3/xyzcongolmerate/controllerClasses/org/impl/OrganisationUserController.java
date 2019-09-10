package ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.OrganisationControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.controllerClasses.org.OrganisationUserControllerInt;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationUserFactory;
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
    public OrganisationUser create(@RequestBody OrganisationUser organisationUser) {
        System.out.println(organisationUser.toString());

        return organisationUserService.create(organisationUser);
    }

    @GetMapping(value = "/create")
    public OrganisationUser create(@RequestParam String orgCode, @RequestParam String userEmail) {
        OrganisationUser valeu= OrganisationUserFactory.buildOrganisationUser(orgCode,userEmail);
        return organisationUserService.create(valeu);
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

    @GetMapping("/getUserName")
    public Set<String> getUserFullNamesInOrganisation(String orgCode){
        return organisationUserService.getUserFullNamesInOrganisation(orgCode);
    }
    @GetMapping("/getUserOrg")
    public Set<String> getUserOrganisations(@RequestParam String userEmail){
        return organisationUserService.getUserOrganisations(userEmail);
    }
}
