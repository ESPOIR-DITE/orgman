package ac.za.cput.adp3.xyzcongolmerate.service.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OrganisationServiceImpl implements OrganisationService {

    private OrganisationRepositoryImpl organisationRepository;
    private static OrganisationServiceImpl organisationService = null;

    private OrganisationServiceImpl() {
        this.organisationRepository =OrganisationRepositoryImpl.getOrganisationRepository();
    }

    public static OrganisationServiceImpl getOrganisationService() {
        if (organisationService == null) organisationService = new OrganisationServiceImpl();
        return organisationService;
    }

    @Override
    public Organisation create(Organisation d) {
        return this.organisationRepository.create(d);
    }

    @Override
    public Organisation read(String orgCode) {
        return this.organisationRepository.read(orgCode);
    }

    @Override
    public Organisation update(Organisation organisation) {
        return this.organisationRepository.update(organisation);
    }

    @Override
    public void delete(String orgCode) {
        this.organisationRepository.delete(orgCode);
    }

    @Override
    public Set<Organisation> getAll() {
        return this.organisationRepository.getAll();
    }
}
