package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import ac.za.cput.adp3.xyzcongolmerate.util.IdGenerator;

public class RoleFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(RoleFactory.class); // Expecting RF from (R)ole(F)actory.

    //TODO: Implement body
    public static Role buildRole(String roleName) {
        return new Role.Builder().roleId(Helper.generateRandomGivenSuffix(SUFFIX)).roleName(roleName).build();

    }
}
