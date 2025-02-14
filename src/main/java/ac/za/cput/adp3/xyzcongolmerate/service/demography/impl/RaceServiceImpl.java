package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.RaceService;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;
    private static RaceServiceImpl raceService = null;

    private RaceServiceImpl() {
        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceServiceImpl getRaceService() {
        if (raceService == null) raceService = new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Race create(Race d) {
        return this.raceRepository.create(d);
    }

    @Override
    public Race read(String raceId) {
        return this.raceRepository.read(raceId);
    }

    @Override
    public Race update(Race race) {
        return this.raceRepository.update(race);
    }

    @Override
    public void delete(String raceId) {
        this.raceRepository.delete(raceId);
    }

    @Override
    public Set<Race> getAll() {
        return this.raceRepository.getAll();
    }
}
