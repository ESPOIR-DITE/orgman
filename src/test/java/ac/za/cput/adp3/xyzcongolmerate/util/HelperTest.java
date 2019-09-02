package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationUserService;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationUserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    OrganisationUserServiceImpl organisationUserService=OrganisationUserServiceImpl.getOrganisationUserService();
    @Test
    public void generateRandomGivenSuffix() {
    }

    @Test
    public void getClassName() {
        System.out.println(Helper.getClassName(organisationUserService.getClass()));
    }

    @Test
    public void getSuffixFromClassName() {
        System.out.println(Helper.getSuffixFromClassName(OrganisationUserService.class));
    }
}