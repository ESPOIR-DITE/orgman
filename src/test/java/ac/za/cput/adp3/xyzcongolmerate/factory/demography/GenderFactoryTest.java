package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {


    @Test
    public void buildGender() {
        Gender gender=GenderFactory.buildGender("MALE");
        Assert.assertNotNull(gender);
        System.out.println(gender.toString());
    }
}