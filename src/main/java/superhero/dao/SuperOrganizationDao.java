package superhero.dao;

import superhero.model.Location;
import superhero.model.Super;
import superhero.model.SuperOrganization;

import java.util.List;

public interface SuperOrganizationDao {

    SuperOrganization getSuperOrganizationById(int superOrgId);

    List<SuperOrganization> getAllSuperOrganizations();

    SuperOrganization addSuperOrganization(SuperOrganization superOrganization);

    void updateSuperOrganization(SuperOrganization superOrganization);

    void deleteSuperOrganizationById(int superOrganizationId);

    List<SuperOrganization> getOrganizationsForSuper(Super superPerson);

    List<SuperOrganization> getOrganizationsForLocation(Location location);

}
