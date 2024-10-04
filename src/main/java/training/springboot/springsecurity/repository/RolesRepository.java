package training.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.springboot.springsecurity.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {

}
