package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDemographyRepositoryImplTest {
    Date bod= new Date();
    UserDemography userDemography=UserDemographyFactory.buildUserDemography("@emksd","CEO","MALE","Black",bod);
    UserDemographyRepositoryImpl userDemographyRepository=UserDemographyRepositoryImpl.getUserDemographyRepository();
    @Test
    public void a_create() {
        Assert.assertNotNull( userDemographyRepository.create(userDemography));
        userDemographyRepository.delete("@emksd");
    }

    @Test
    public void b_read() {
       UserDemography result= userDemographyRepository.create(userDemography);
        Assert.assertNotNull(userDemographyRepository.read(result.getUserEmail()));
        userDemographyRepository.delete("@emksd");
    }

    @Test
    public void c_update() {
        UserDemography result= userDemographyRepository.create(userDemography);
        UserDemography userDemography2=UserDemographyFactory.buildUserDemography("@emksd","CEO","Female","Black",bod);
        UserDemography result2= userDemographyRepository.update(userDemography2);

       // System.out.println(result +"<<<<<>>>>>>>>"+ result2);
        Assert.assertNotEquals(result.toString(),result2.toString());
        userDemographyRepository.delete("@emksd");

    }

    @Test
    public void e_delete() {
        UserDemography result= userDemographyRepository.create(userDemography);
        userDemographyRepository.delete(result.getUserEmail());
        Assert.assertNull(userDemographyRepository.read(result.getUserEmail()));
        userDemographyRepository.delete("@emksd");
    }

    @Test
    public void d_getAll() {
        for(int i=0;i<3;i++){
            userDemographyRepository.create(userDemography);}
        for(int i=0;i<3;i++){
            Assert.assertNotNull(userDemographyRepository.getAll());
        }
    }
}