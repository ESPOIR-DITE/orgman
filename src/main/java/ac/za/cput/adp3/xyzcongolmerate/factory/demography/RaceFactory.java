package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import ac.za.cput.adp3.xyzcongolmerate.util.IdGenerator;

public class RaceFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(RaceFactory.class); // Expecting RF from (R)ace(F)actory.
    //TODO: Implement body
    public static Race buildRace(String raceDescription) {
        return new Race.Builder().raceDescription(raceDescription).raceId(Helper.generateRandomGivenSuffix(SUFFIX)).build();
    }
}
