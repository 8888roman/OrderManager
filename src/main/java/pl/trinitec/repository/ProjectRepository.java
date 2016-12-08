package pl.trinitec.repository;

import org.springframework.data.repository.CrudRepository;
import pl.trinitec.domain.Address;
import pl.trinitec.domain.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findById(Long id);

}
