package oc_projects.project6.repositories;

import oc_projects.project6.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
