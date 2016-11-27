package pl.trinitec.repository;

import org.springframework.data.repository.CrudRepository;
import pl.trinitec.domain.Part;
import pl.trinitec.domain.Supplier;

import java.util.List;

/**
 * Created by AN-KOP on 2016-11-19.
 */
public interface PartRepository extends CrudRepository<Part, Long> {
    List<Part> findByName(String name);

}
