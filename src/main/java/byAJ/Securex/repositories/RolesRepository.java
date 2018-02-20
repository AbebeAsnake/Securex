package byAJ.Securex.repositories;

import byAJ.Securex.models.Roles;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends CrudRepository<Roles, Long>{
    Roles findRolesByRoleName(String roleName);
}
